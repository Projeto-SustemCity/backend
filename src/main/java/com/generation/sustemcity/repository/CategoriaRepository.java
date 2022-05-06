package com.generation.sustemcity.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.sustemcity.model.Categoria;

import java.util.List;




@Repository 
public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
	public List <Categoria> findAllByCategoriaContainingIgnoreCase(@Param("categoria")String categoria);
		
	}

