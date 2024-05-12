package com.br.fiap.grahpqlfiap.controller;

import com.br.fiap.grahpqlfiap.model.Produto;
import com.br.fiap.grahpqlfiap.repository.ProdutoRepository;
import com.br.fiap.grahpqlfiap.service.ProdutoService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.Arguments;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProdutoController {

    final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @MutationMapping
    public Produto save(@Argument Produto produto){
       return service.save(produto);
    }

    @QueryMapping
    public Produto findById(@Argument Long id){
       return service.findById(id);
    }

}
