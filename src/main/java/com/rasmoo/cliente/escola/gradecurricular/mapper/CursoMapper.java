package com.rasmoo.cliente.escola.gradecurricular.mapper;

import org.modelmapper.ModelMapper;

import com.rasmoo.cliente.escola.gradecurricular.entity.CursoEntity;
import com.rasmoo.cliente.escola.gradecurricular.model.CursoModel;

public class CursoMapper {
	
	public CursoMapper() {
		
	}
	
	public static CursoEntity fromModelToEntity(CursoModel cursoModel) {
		CursoEntity cursoEntity = new CursoEntity();
		cursoEntity.setNome(cursoModel.getNome());
		cursoEntity.setCodigo(cursoModel.getCodigo());
		
		return cursoEntity;
		
		
	}
	

}
