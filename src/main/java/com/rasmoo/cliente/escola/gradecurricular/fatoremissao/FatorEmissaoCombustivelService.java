//package com.rasmoo.cliente.escola.gradecurricular.fatoremissao;
//
//import java.time.LocalDate;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.rasmoo.cliente.escola.gradecurricular.entity.CursoEntity;
//
//@Service
//public class FatorEmissaoCombustivelService implements IFatorEmissaoCombustivelService {
//
//	@Autowired
//	private IFatorEmissaoCombustivelRepository combustivelRepository;
//
//	@Override
//	public Boolean atualizar(FatorEmissaoCombustivelDto combustivelDto) {
//
//		try {
//
//			FatorEmissaoCombustivelEntity combustivelEntity = FatorEmissaoCombustivelMapper
//					.fromModelToEntity(combustivelDto);
//			combustivelEntity.setUpdateAt(LocalDate.now());
//
//			this.combustivelRepository.save(combustivelEntity);
//			return Boolean.TRUE;
//		}
//
//		catch (Exception e) {
//
//			return Boolean.FALSE;
//		}
//	}
//
//	@Override
//	public List<FatorEmissaoCombustivelEntity> listar() {
//		try {
//			List<FatorEmissaoCombustivelEntity> combustivelLista = combustivelRepository.findAll();
//
//			return combustivelLista;
//		} catch (Exception e) {
//			throw e;
//		}
//	}
//
//	@Override
//	public FatorEmissaoCombustivelEntity consultar(Long id) {
//		try {
//			Optional<FatorEmissaoCombustivelEntity> consultaPorId = combustivelRepository.findById(id);
//
//			if (consultaPorId.isEmpty()) {
//				throw new Exception("Id não encontrado.");
//			}
//
//			return consultaPorId.get();
//
//		} catch (Exception e) {
//			// throw e;
//		}
//	}
//
//	@Override
//	public Boolean cadastrar(FatorEmissaoCombustivelDto combustivelDto) {
//		try {
//			FatorEmissaoCombustivelEntity combustivelEntity = FatorEmissaoCombustivelMapper
//					.fromModelToEntity(combustivelDto);
//			combustivelEntity.setCreatedAt(LocalDate.now());
//			this.combustivelRepository.save(combustivelEntity);
//			return Boolean.TRUE;
//		} catch (Exception e) {
//
//			return Boolean.FALSE;
//		}
//
//	}
//
//}
