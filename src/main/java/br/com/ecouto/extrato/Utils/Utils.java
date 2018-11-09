package br.com.ecouto.extrato.Utils;

import br.com.ecouto.extrato.entity.LancamentoConta;
import br.com.ecouto.extrato.model.LancamentoContaLegado;

public class Utils {

	//faz o parse do Objeto LancamentoContaLegado para o Objeto LancamentoConta (tela) 
	public static LancamentoConta parse(LancamentoContaLegado lancamentoContaLegado) {
		return new LancamentoConta();
	}
}
