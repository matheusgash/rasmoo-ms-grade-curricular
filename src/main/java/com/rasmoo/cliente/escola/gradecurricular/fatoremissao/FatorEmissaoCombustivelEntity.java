//package com.rasmoo.cliente.escola.gradecurricular.fatoremissao;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//
//import lombok.Data;
//
//@Data
//@Entity
//@Table(name = "fator_emissao_combustivel")
//public class FatorEmissaoCombustivelEntity implements Serializable {
//
//	private static final long serialVersionUID = 442026401833297513L;
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	private Long id;
//
//	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
//	@Column(name = "created_at")
//	private LocalDate createdAt;
//
//	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
//	@Column(name = "updated_at")
//	private LocalDate updateAt;
//
//	@Column(name = "gasolina", nullable = false)
//	private BigDecimal gasolina;
//
//	@Column(name = "gasolina_adtivada", nullable = false)
//	private BigDecimal gasolinaAdtivada;
//
//	@Column(name = "diesel", nullable = false)
//	private BigDecimal diesel;
//
//	@Column(name = "etanol", nullable = false)
//	private BigDecimal etanol;
//
//	@Column(name = "etanol_adtivada", nullable = false)
//	private BigDecimal etanoAdtivado;
//
//}
