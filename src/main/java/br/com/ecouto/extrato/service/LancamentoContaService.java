package br.com.ecouto.extrato.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ecouto.extrato.entity.LancamentoConta;
import br.com.ecouto.extrato.model.LancamentoContaLegado;
import br.com.ecouto.extrato.repository.LancamentoContaRepositoryImpl;

@Service
public class LancamentoContaService {

	@Autowired
	LancamentoContaRepositoryImpl repository;
	
	public List<LancamentoConta> listaLancamentoConta(){
		
		List<LancamentoConta> lista = new  ArrayList<LancamentoConta>();
		
		
		LancamentoContaLegado listarLancamentosContaLegado = repository.listarLancamentosContaLegado();
		
		listarLancamentosContaLegado.getListaControleLancamento().stream().forEach(lancamento ->{
			LancamentoConta lancamentoConta = new LancamentoConta();
			lancamentoConta.setDataLancamento(lancamento.getDataLancamentoContaCorrenteCliente());
			lancamentoConta.setDescricao(lancamento.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa());
			lancamentoConta.setNumero(lancamento.getLancamentoContaCorrenteCliente().getNumeroRemessaBanco());
			lancamentoConta.setSituacao(lancamento.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa());
			lancamentoConta.setDataConfirmacao(lancamento.getDateEfetivaLancamento());
			
			String dadosBancarios = "";
			if(lancamento.getNomeBanco() != null) {
				dadosBancarios = lancamento.getNomeBanco()+ " ";
				lancamentoConta.setNomeBanco(lancamento.getNomeBanco());
			}
			if(lancamento.getLancamentoContaCorrenteCliente() != null && lancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario() != null) {
				dadosBancarios = dadosBancarios.concat("Ag "+lancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia());
				lancamentoConta.setNumeroAgencia(lancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia());
				dadosBancarios = dadosBancarios.concat(" CC "+lancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente());
				lancamentoConta.setNumeroConta(lancamento.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroContaCorrente());
				
			}
			lancamentoConta.setDadosBancarios(dadosBancarios);
			lancamentoConta.setValorFinal(lancamento.getValorLancamentoRemessa());
			lista.add(lancamentoConta);
		});
		return lista;
	}
}
