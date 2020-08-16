package com.dxctraining.ItBook.dao;

import com.dxctraining.ItBook.entities.*;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ItDaoImpl implements IItDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ItBook add(ItBook itbook) {
        itbook=entityManager.merge(itbook);
        return itbook;
    }
    
	@Override
	public ItBook findBookById(int id) {
		ItBook itbook = entityManager.find(ItBook.class, id);
		return itbook;
	}

}
