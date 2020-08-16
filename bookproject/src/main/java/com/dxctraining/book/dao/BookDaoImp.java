package com.dxctraining.book.dao;

import com.dxctraining.book.entities.*;
import com.dxctraining.exceptions.*;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BookDaoImp implements IBookDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Book findBookById(int idArg) {
		Book book = entityManager.find(Book.class, idArg);
		if (book == null) {
			throw new BookNotFoundException("book not found for id=" + idArg);
		}
		return book;
	}

	@Override
	public Book add(Book book) {
		book = entityManager.merge(book);
		return book;
	}

	@Override
	public Book update(Book book) {
		book = entityManager.merge(book);
		return book;
	}

	@Override
	public void remove(int id) {
		Book book = findBookById(id);
		entityManager.remove(book);
	}

}
