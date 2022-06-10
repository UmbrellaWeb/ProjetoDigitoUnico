package com.projetoDU.ProjetoDigitoUnico.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.projetoDU.ProjetoDigitoUnico.entity.Pessoa;
import com.projetoDU.ProjetoDigitoUnico.service.PessoaService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @RequestMapping(method = RequestMethod.POST)
    public Pessoa salvar(Pessoa pessoa){
        return pessoaService.salvar(pessoa);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Pessoa> listaPessoa(){
        return pessoaService.ListaPessoa();
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Pessoa> buscarPessoaPorId(@PathVariable Long id){
        return pessoaService.buscarPorId(id);
    }
    @RequestMapping( value = "/{id}", method=RequestMethod.DELETE)
    public void removerPessoa(@PathVariable Long id){
        pessoaService.removerPorId(id);
    }
}