package com.spring.docker.compose.services.user;

import com.spring.docker.compose.models.User;

public interface UserService{
	User save(User user);
}