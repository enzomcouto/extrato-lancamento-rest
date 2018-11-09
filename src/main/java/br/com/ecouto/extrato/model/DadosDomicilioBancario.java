package br.com.ecouto.extrato.model;

import java.io.Serializable;

public class DadosDomicilioBancario implements Serializable{

	/**
	 * Dados de Domicilio Bancario
	 */
	private static final long serialVersionUID = 693391786755509061L;
	private Integer codigoBanco;
	private Integer numeroAgencia;
	private String numeroContaCorrente;
	public Integer getCodigoBanco() {
		return codigoBanco;
	}
	public void setCodigoBanco(Integer codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}
}
