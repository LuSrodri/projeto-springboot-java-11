package com.LucasSantos.projetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LucasSantos.projetospringboot.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
