package com.dxctraining.author.dao;

import com.dxctraining.author.entities.*;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AuthorDaoImpl implements IAuthorDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Author add(Author author) {
        author=entityManager.merge(author);
        return author;
    }
    
}
