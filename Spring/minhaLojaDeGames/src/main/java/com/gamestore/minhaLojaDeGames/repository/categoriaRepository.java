package com.gamestore.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamestore.minhaLojaDeGames.model.Categoria;

@Repository
public interface categoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByNomeProdutoContainingIgnoreCase (String nomeProduto);
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);
	
}
