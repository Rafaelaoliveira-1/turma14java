package com.gamestore.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamestore.minhaLojaDeGames.model.Categoria;
import com.gamestore.minhaLojaDeGames.model.Produto;

@Repository
public interface produtoRepository extends JpaRepository<Produto, Long> {

		public List<Produto> findAllBynomeProdutoContainingIgnoreCase (String nomeProduto);
		public List<Produto> findAllByDescricaoContainingIgnoreCase (String descricao);
}
