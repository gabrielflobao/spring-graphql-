package com.br.fiap.grahpqlfiap.repository;

import com.br.fiap.grahpqlfiap.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
