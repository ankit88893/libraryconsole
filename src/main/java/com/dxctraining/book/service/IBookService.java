package com.dxctraining.book.service;


import com.dxctraining.book.entities.*;


public interface IBookService {
	
	public void remove(int id);
	 public Book add(Book book);
	 public Book update(Book book);
	 public Book findBookById(int id);
	
}

