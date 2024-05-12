package com.br.fiap.grahpqlfiap.service;


import com.br.fiap.grahpqlfiap.model.Produto;
import com.br.fiap.grahpqlfiap.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto save(Produto produto){
        return this.repository.save(produto);
    }
    public Produto findById(Long id){
        return this.repository.findById(id).orElse(null);
    }
}
