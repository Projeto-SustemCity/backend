package com.generation.sustemcity.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.sustemcity.model.Produto;

import java.util.List;




@Repository 
public interface ProdutoRepository extends JpaRepository <Produto, Long> {
	public List <Produto> findAllByProdutoContainingIgnoreCase(@Param("produto")String produto);
		
}