package com.spring.docker.compose.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.docker.compose.models.User;
import com.spring.docker.compose.repositories.interfaces.UserRepositoryCustom;

@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom{
    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

	@Override
	public List<User> getAll() {
		CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
        Root<User> userRoot = criteriaQuery.from(User.class);

        criteriaQuery.select(userRoot);
        try {
            return this.entityManager.createQuery(criteriaQuery).getResultList();
        } catch (final NoResultException nre) {
            return null;
        }
	}	
}