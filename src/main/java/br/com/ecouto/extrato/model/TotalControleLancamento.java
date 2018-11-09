package br.com.ecouto.extrato.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TotalControleLancamento implements Serializable{

	private Integer quantidadeLancamentos;
	private Integer quantidadeRemessas;
	private BigDecimal valorLancamentos;
	
	/**
	 * Classe que representa os Totais do Cpntrole de Lancamento
	 */
	private static final long serialVersionUID = 7492676415574841487L;
	public Integer getQuantidadeLancamentos() {
		return quantidadeLancamentos;
	}
	public void setQuantidadeLancamentos(Integer quantidadeLancamentos) {
		this.quantidadeLancamentos = quantidadeLancamentos;
	}
	public Integer getQuantidadeRemessas() {
		return quantidadeRemessas;
	}
	public void setQuantidadeRemessas(Integer quantidadeRemessas) {
		this.quantidadeRemessas = quantidadeRemessas;
	}
	public BigDecimal getValorLancamentos() {
		return valorLancamentos;
	}
	public void setValorLancamentos(BigDecimal valorLancamentos) {
		this.valorLancamentos = valorLancamentos;
	}
	
	
	

}
