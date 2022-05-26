package com.spring.docker.compose.repositories.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.docker.compose.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}