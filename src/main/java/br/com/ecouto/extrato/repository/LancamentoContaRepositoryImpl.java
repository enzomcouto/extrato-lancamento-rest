package br.com.ecouto.extrato.repository;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.ecouto.extrato.exception.Exception;
import br.com.ecouto.extrato.model.LancamentoContaLegado;

@Repository
public class LancamentoContaRepositoryImpl implements LancamentoContaRepository{

	@Override
	public LancamentoContaLegado listarLancamentosContaLegado() {
		
		ObjectMapper objectmapper = new ObjectMapper();
		objectmapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		InputStream input = this.getClass().getClassLoader().getResourceAsStream("lancamento-conta-legado.json");

		try {
			return objectmapper.readValue(input, LancamentoContaLegado.class);
		} catch (IOException e) {
				throw new Exception("Ocorreu erro ao listar os dados do Lancamento Legado");
		}
				
	}
}
