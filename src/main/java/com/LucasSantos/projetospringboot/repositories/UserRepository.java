package com.LucasSantos.projetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LucasSantos.projetospringboot.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
