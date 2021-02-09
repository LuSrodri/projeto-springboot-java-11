package com.LucasSantos.projetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LucasSantos.projetospringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
