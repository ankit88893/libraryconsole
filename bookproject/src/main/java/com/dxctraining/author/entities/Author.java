package com.dxctraining.author.entities;

import javax.persistence.Entity;

import com.dxctraining.book.entities.Book;

@Entity
public class Author extends Book{
	private String id;
	private String name;
	
	public Author(String name){	
		//this.id=id;
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
	public void setId(String id){
		this.id=id;
	}

	public String getId() {
		return id;
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

		if ((obj == null) || !(obj instanceof Author)) {
			return false;
		}

		Author that = (Author) obj;
		boolean isequal = this.id.equals(that.id);
		return isequal;
	}
	
	
	
	
	
	
	
	
	
}