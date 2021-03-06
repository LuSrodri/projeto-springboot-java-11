package com.LucasSantos.projetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LucasSantos.projetospringboot.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
