package br.com.ecouto.extrato.model;

import java.io.Serializable;
import java.util.List;

public class LancamentoContaLegado implements Serializable {

	
	/**
	 * Classe Modelo que representa os dados oriundos do Sistema Legado
	 */
	private static final long serialVersionUID = -5657075617448367266L;
	
	
	private TotalControleLancamento totalControleLancamento;
	private List<ControleLancamento> listaControleLancamento;
	private Integer indice;
	private Integer tamanhoPagina;
	private Integer TotalElements;
	
	
	public TotalControleLancamento getTotalControleLancamento() {
		return totalControleLancamento;
	}
	public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
		this.totalControleLancamento = totalControleLancamento;
	}
	public List<ControleLancamento> getListaControleLancamento() {
		return listaControleLancamento;
	}
	public void setListaControleLancamento(List<ControleLancamento> listaControleLancamento) {
		this.listaControleLancamento = listaControleLancamento;
	}
	public Integer getIndice() {
		return indice;
	}
	public void setIndice(Integer indice) {
		this.indice = indice;
	}
	public Integer getTamanhoPagina() {
		return tamanhoPagina;
	}
	public void setTamanhoPagina(Integer tamanhoPagina) {
		this.tamanhoPagina = tamanhoPagina;
	}
	public Integer getTotalElements() {
		return TotalElements;
	}
	public void setTotalElements(Integer totalElements) {
		TotalElements = totalElements;
	}
	
	

}
