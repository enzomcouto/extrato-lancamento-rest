package br.com.ecouto.extrato.model;

import java.io.Serializable;

public class LancamentoContaCorrenteCliente implements Serializable {

	/**
	 * Classe que representa o Lancamento na Conta Corrente
	 */
	private static final long serialVersionUID = -7954654594787442006L;
	private Long numeroRemessaBanco;
	//private DadosAnaliticoLancamentoFinanceiroCliente dadosAnaliticoLancamentoFinanceiroCliente;
	private String nomeSituacaoRemessa;
    private DadosDomicilioBancario dadosDomicilioBancario;
    private String nomeTipoOperacao;
     
	public Long getNumeroRemessaBanco() {
		return numeroRemessaBanco;
	}
	public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
		this.numeroRemessaBanco = numeroRemessaBanco;
	}
	/*
	public DadosAnaliticoLancamentoFinanceiroCliente getDadosAnaliticoLancamentoFinanceiroCliente() {
		return dadosAnaliticoLancamentoFinanceiroCliente;
	}
	public void setDadosAnaliticoLancamentoFinanceiroCliente(
			DadosAnaliticoLancamentoFinanceiroCliente dadosAnaliticoLancamentoFinanceiroCliente) {
		this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
	}
	*/
	public String getNomeSituacaoRemessa() {
		return nomeSituacaoRemessa;
	}
	public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
		this.nomeSituacaoRemessa = nomeSituacaoRemessa;
	}
	public DadosDomicilioBancario getDadosDomicilioBancario() {
		return dadosDomicilioBancario;
	}
	public void setDadosDomicilioBancario(DadosDomicilioBancario dadosDomicilioBancario) {
		this.dadosDomicilioBancario = dadosDomicilioBancario;
	}
	public String getNomeTipoOperacao() {
		return nomeTipoOperacao;
	}
	public void setNomeTipoOperacao(String nomeTipoOperacao) {
		this.nomeTipoOperacao = nomeTipoOperacao;
	}	
    
    
}
