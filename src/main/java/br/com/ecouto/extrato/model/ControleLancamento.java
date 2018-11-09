package br.com.ecouto.extrato.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ControleLancamento implements Serializable{

	/**
	 * Classe que representa o controle de Lancamento
	 */
	private static final long serialVersionUID = 4802864362755869586L;
	
	
	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataEfetivaLancamento;	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataLancamentoContaCorrenteCliente;
	private Long numeroEvento;
	private String descricaoGrupoPagamento;
	private String codigoIdentificadorUnico;
	private String nomeBanco;
	private Long quantidadeLancamentoRemessa;
	private String numeroRaizCNPJ;
	private String numeroSufixoCNPJ;
	private BigDecimal valorLancamentoRemessa;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dateLancamentoContaCorrenteCliente;	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dateEfetivaLancamento;

	
	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}
	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}
	public Date getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}
	public void setDataEfetivaLancamento(Date dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}
	public Date getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}
	public void setDataLancamentoContaCorrenteCliente(Date dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}
	public Long getNumeroEvento() {
		return numeroEvento;
	}
	public void setNumeroEvento(Long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}
	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}
	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}
	public String getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}
	public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public Long getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}
	public void setQuantidadeLancamentoRemessa(Long quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}
	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}
	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}
	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}
	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}
	public BigDecimal getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}
	public void setValorLancamentoRemessa(BigDecimal valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}
	public Date getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}
	public void setDateLancamentoContaCorrenteCliente(Date dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}
	public Date getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}
	public void setDateEfetivaLancamento(Date dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
	}
	
}