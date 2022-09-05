package com.rasmoo.cliente.escola.gradecurricular.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.rasmoo.cliente.escola.gradecurricular.controller.MateriaController;
import com.rasmoo.cliente.escola.gradecurricular.dto.MateriaDto;
import com.rasmoo.cliente.escola.gradecurricular.entity.CursoEntity;
import com.rasmoo.cliente.escola.gradecurricular.entity.MateriaEntity;
import com.rasmoo.cliente.escola.gradecurricular.exception.CursoException;
import com.rasmoo.cliente.escola.gradecurricular.exception.MateriaException;
import com.rasmoo.cliente.escola.gradecurricular.mapper.CursoMapper;
import com.rasmoo.cliente.escola.gradecurricular.model.CursoModel;
import com.rasmoo.cliente.escola.gradecurricular.repository.ICursoRepository;
import com.rasmoo.cliente.escola.gradecurricular.repository.IMateriaRepository;

@Service
public class CursoService implements ICursoService {

	private ModelMapper mapper;
	private ICursoRepository cursoRepository;
	private IMateriaRepository materiaRepository;
	private static final String MENSAGEM_ERRO = "Erro interno identificado, contate o suporte";
	private static final String CURSO_NAO_ENCONTRADO = "Curso não encontrado";

	@Autowired
	public CursoService(ICursoRepository cursoRepository, IMateriaRepository materiaRepository) {
		this.mapper = new ModelMapper();
		this.cursoRepository = cursoRepository;
		this.materiaRepository = materiaRepository;
	}

	@Override
	public Boolean atualizar(CursoModel cursoModel) {
		CursoEntity cursoEntity = new CursoEntity();
		Optional<CursoEntity> buscarId = cursoRepository.findById(cursoModel.getId());

		List<MateriaEntity> listaMateria = new ArrayList<>();

		if (buscarId.isEmpty()) {
			return Boolean.FALSE;

		}

		List<Long> lista = cursoModel.getMaterias();
		lista.forEach(materiaId -> {
			MateriaEntity materiaEntity = materiaRepository.findById(materiaId).get();
			listaMateria.add(materiaEntity);
		});
		cursoEntity.setId(cursoModel.getId());
		cursoEntity.setNome(cursoModel.getNome());
		cursoEntity.setCodigo(cursoModel.getCodigo());
		cursoEntity.setMaterias(listaMateria);
		this.cursoRepository.save(cursoEntity);
		return Boolean.TRUE;
	}

	@Override
	public Boolean excluir(Long id) {
		try {
			this.cursoRepository.deleteById(id);

			return Boolean.TRUE;
		} catch (Exception e) {
			throw new CursoException(MENSAGEM_ERRO, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public List<CursoEntity> listar() {
		try {
			List<CursoEntity> cursoEntity = cursoRepository.findAll();
			return cursoEntity;
		} catch (Exception e) {
			throw new CursoException(MENSAGEM_ERRO, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@Override
	public List<CursoEntity> consultarPorCodigo(String codigo) {
		try {
			List<CursoEntity> curso = this.cursoRepository.findByCodigo(codigo);
			if (curso.isEmpty()) {
				throw new CursoException(CURSO_NAO_ENCONTRADO, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			return curso;
		} catch (CursoException c) {
			throw c;
		}
	}

	@Override
	public Boolean cadastrar(CursoModel cursoModel) {
		List<MateriaEntity> listaMateria = new ArrayList<>();
		try {
			CursoEntity cursoEntity = CursoMapper.fromModelToEntity(cursoModel);
			List<Long> lista = cursoModel.getMaterias();
			lista.forEach(materiaId -> {
				MateriaEntity materiaEntity = materiaRepository.findById(materiaId).get();
				listaMateria.add(materiaEntity);
			});
			cursoEntity.setMaterias(listaMateria);
			this.cursoRepository.save(cursoEntity);
			return Boolean.TRUE;

		} catch (Exception e) {
			throw new CursoException(MENSAGEM_ERRO, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
