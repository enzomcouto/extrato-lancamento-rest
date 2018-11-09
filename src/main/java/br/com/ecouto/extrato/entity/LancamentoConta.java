package br.com.ecouto.extrato.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class LancamentoConta {

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
  private Date dataLancamento;
  private String descricao;
  private String nomeBanco;
  private Integer numeroAgencia;
  private String numeroConta;
  public String getNomeBanco() {
	return nomeBanco;
}
public void setNomeBanco(String nomeBanco) {
	this.nomeBanco = nomeBanco;
}
public Integer getNumeroAgencia() {
	return numeroAgencia;
}
public void setNumeroAgencia(Integer numeroAgencia) {
	this.numeroAgencia = numeroAgencia;
}
public String getNumeroConta() {
	return numeroConta;
}
public void setNumeroConta(String numeroConta) {
	this.numeroConta = numeroConta;
}
private Long numero;
  private String situacao;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
  private Date dataConfirmacao;
  private String dadosBancarios;
  
  
  public Date getDataLancamento() {
	return dataLancamento;
}
public void setDataLancamento(Date dataLancamento) {
	this.dataLancamento = dataLancamento;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Long getNumero() {
	return numero;
}
public void setNumero(Long numero) {
	this.numero = numero;
}
public String getSituacao() {
	return situacao;
}
public void setSituacao(String situacao) {
	this.situacao = situacao;
}
public Date getDataConfirmacao() {
	return dataConfirmacao;
}
public void setDataConfirmacao(Date dataConfirmacao) {
	this.dataConfirmacao = dataConfirmacao;
}
public String getDadosBancarios() {
	return dadosBancarios;
}
public void setDadosBancarios(String dadosBancarios) {
	this.dadosBancarios = dadosBancarios;
}
public BigDecimal getValorFinal() {
	return valorFinal;
}
public void setValorFinal(BigDecimal valorFinal) {
	this.valorFinal = valorFinal;
}
private BigDecimal valorFinal;
}
