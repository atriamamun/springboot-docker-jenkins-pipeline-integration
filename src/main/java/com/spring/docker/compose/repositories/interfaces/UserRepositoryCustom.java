package com.spring.docker.compose.repositories.interfaces;

import java.util.List;

import com.spring.docker.compose.models.User;

public interface UserRepositoryCustom{
    public List<User> getAll();
	
}