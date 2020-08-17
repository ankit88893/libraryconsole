package com.dxctraining.book.dao;


import com.dxctraining.book.entities.*;

public interface IBookDao {

    Book findBookById(int id);

    Book update(Book book);

    Book add(Book book);

    void remove(int id);

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}