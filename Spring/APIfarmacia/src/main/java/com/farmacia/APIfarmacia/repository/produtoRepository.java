package com.farmacia.APIfarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.APIfarmacia.model.Produto;

	public interface produtoRepository extends JpaRepository<Produto, Long>{
		public List<Produto> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
	}

