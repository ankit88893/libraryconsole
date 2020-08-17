package com.dxctraining.book.service;

import com.dxctraining.book.dao.*;
import com.dxctraining.book.entities.*;
import com.dxctraining.exceptions.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class BookServiceImp implements IBookService {
	@Autowired
	private IBookDao dao;

	@Override
	public Book findBookById(int id) {
		Book book = dao.findBookById(id);
		return book;
	}

	@Override
	public Book update(Book book) {
		validate(book);
		book = dao.update(book);
		return book;
	}

	@Override
	public Book add(Book book) {
		validate(book);
		book = dao.add(book);
		return book;
	}

	@Override
	public void remove(int id) {
		dao.remove(id);
	}
		
	  public void validate(Object arg){
	        if(arg==null){
	            throw new InvalidArgumentException("argument is null");
	        }
/*
	void validateName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidArgumentException("Book name can't be null or empty");
		}
	}

	void validateId(String id) {
		if (id == null || id.isEmpty()) {
			throw new InvalidArgumentException("Book Id can't be null or empty");
		}
	}

	void validateCost(double cost) {
		if (cost < 0) {
			throw new InvalidCostException("cost can not be -ve");
		}
*/
	}

}