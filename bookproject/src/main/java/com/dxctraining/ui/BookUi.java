package com.dxctraining.ui;

import com.dxctraining.author.entities.*;
import com.dxctraining.fictionbook.entities.*;
import com.dxctraining.ItBook.entities.*;
import com.dxctraining.exceptions.*;
import com.dxctraining.author.service.*;
import com.dxctraining.book.entities.Book;
import com.dxctraining.book.service.IBookService;
import com.dxctraining.fictionbook.service.*;
import com.dxctraining.ItBook.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

import javax.annotation.PostConstruct;

@Component
public class BookUi {
	@Autowired
	private IBookService bookService;
	@Autowired
	private IFictionService fictionService;
	@Autowired
	private IItService itService;
	@Autowired
	private IAuthorService authorService;

	public static void main(String[] args) {
		BookUi demo = new BookUi();
		demo.runApp();
	}

	@PostConstruct
	public void runApp() {

		try {
			Author author1 = new Author("yashwant");
			Author author2 = new Author("arun sharma");
			// Author author3 = new Author("spanish", "lord of the rings");
			// Author author4 = new Author("harry potter", "jk rowling");

			Book book1 = new Book("c", 200, author1);
			Book book2 = new Book("java", 300, author2);
			// Book book3 = new Book("3", "ankur", 900, author3);
			// Book book4 = new Book("4", "anil", 500, author4);
	            FictionBook fiction = new FictionBook("half blood",300,author1,"harry");
	            fiction=fictionService.add(fiction);

	            ItBook itbook = new ItBook("let us c", 2200, author2,"c language");
	            itbook =itService.add(itbook);

	            String fictionId1 = fiction.getId();
	            FictionBook fbook = fictionService.findBookById(fictionId1);
	            System.out.println("fetcehed book =" + fbook.getName() + " " + fbook.getCost()+ " " + fbook.getAuthor());

	            System.out.println("character used=" + fbook.getCharacterName());


	        } catch (BookNotFoundException e) {
	            e.printStackTrace();
	        } catch (InvalidArgumentException e) {
	            e.printStackTrace();
	        }
		}
	}
	        
