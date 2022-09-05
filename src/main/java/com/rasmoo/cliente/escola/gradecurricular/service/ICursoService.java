package com.rasmoo.cliente.escola.gradecurricular.service;

import java.util.List;

import com.rasmoo.cliente.escola.gradecurricular.entity.CursoEntity;
import com.rasmoo.cliente.escola.gradecurricular.model.CursoModel;

public interface ICursoService {

	public Boolean atualizar(final CursoModel cursoModel);

	public Boolean excluir(final Long id);

	public List<CursoEntity> listar();

	public List <CursoEntity> consultarPorCodigo(final String codigo);

	public Boolean cadastrar(final CursoModel cursoModel);

}