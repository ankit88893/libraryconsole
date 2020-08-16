package com.dxctraining.fictionbook.dao;

import com.dxctraining.fictionbook.entities.FictionBook;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class FictionDaoImpl implements IFictionDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public FictionBook add(FictionBook fiction) {
		fiction = entityManager.merge(fiction);
		return fiction;
	}

	@Override
	public FictionBook findBookById(String id) {
		FictionBook fiction = entityManager.find(FictionBook.class, id);
		return fiction;
	}
}
