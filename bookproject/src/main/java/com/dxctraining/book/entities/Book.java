package com.dxctraining.book.entities;

import javax.persistence.Entity;

import com.dxctraining.author.entities.Author;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Book {
	@Id
	@GeneratedValue
	private String id, name;

	private double cost;

	private Author author;

	public Book() {
	}

	public Book(String name, double cost, Author author) {
		// this.id = id;
		this.name = name;
		this.cost = cost;
		this.setAuthor(author);
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	@Override
	public int hashCode() {
		int hash = id.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if ((obj == null) || !(obj instanceof Book)) {
			return false;
		}

		Book that = (Book) obj;
		boolean isequal = this.id.equals(that.id);
		return isequal;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}