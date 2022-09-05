//package com.rasmoo.cliente.escola.gradecurricular.fatoremissao;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//
//import org.springframework.format.annotation.NumberFormat;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//@Builder
//@Getter
//@EqualsAndHashCode
//@AllArgsConstructor
//@NoArgsConstructor
//public class FatorEmissaoCombustivelDto implements Serializable {
//
//	private static final long serialVersionUID = -927693571626125007L;
//
//	@Min(value = 0, message = "Porcetagem não pode ser menor que 0%")
//	@Max(value = 10, message = "Porcentagem não pode ser maior que 100%")
//	@NumberFormat(style = NumberFormat.Style.PERCENT)
//	private BigDecimal gasolina;
//
//	@Min(value = 0, message = "Porcetagem não pode ser menor que 0%")
//	@Max(value = 10, message = "Porcentagem não pode ser maior que 100%")
//	@NumberFormat(style = NumberFormat.Style.PERCENT)
//	private BigDecimal gasolinaAdtivada;
//
//	@Min(value = 0, message = "Porcetagem não pode ser menor que 0%")
//	@Max(value = 10, message = "Porcentagem não pode ser maior que 100%")
//	@NumberFormat(style = NumberFormat.Style.PERCENT)
//	private BigDecimal diesel;
//
//	@Min(value = 0, message = "Porcetagem não pode ser menor que 0%")
//	@Max(value = 10, message = "Porcentagem não pode ser maior que 100%")
//	@NumberFormat(style = NumberFormat.Style.PERCENT)
//	private BigDecimal etanol;
//
//	@Min(value = 0, message = "Porcetagem não pode ser menor que 0%")
//	@Max(value = 10, message = "Porcentagem não pode ser maior que 100%")
//	@NumberFormat(style = NumberFormat.Style.PERCENT)
//	private BigDecimal etanoAdtivado;
//
//}
