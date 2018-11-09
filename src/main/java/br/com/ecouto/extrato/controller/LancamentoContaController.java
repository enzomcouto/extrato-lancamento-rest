package br.com.ecouto.extrato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecouto.extrato.entity.LancamentoConta;
import br.com.ecouto.extrato.service.LancamentoContaService;

@RestController
public class LancamentoContaController {


	
	@Autowired
	LancamentoContaService service;

    @RequestMapping(value = "/consulta/lancamentos", method = RequestMethod.GET)
    public List<LancamentoConta> listar() {
        return this.service.listaLancamentoConta();
    }
}
