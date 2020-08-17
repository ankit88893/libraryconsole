package com.dxctraining.ItBook.entities;

import com.dxctraining.author.entities.Author;
import com.dxctraining.book.entities.Book;

public class ItBook extends Book {
	
	String language;
	//double version;
	
	public ItBook(String name,double cost, Author author,String language){
		super(name,cost,author);
		this.language=language;
	//	this.version=version;
		
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItBook other = (ItBook) obj;
		if (language == null) {
			if (other.language != null)
				return false;
		} else if (!language.equals(other.language))
			return false;
		return true;
	}
/*
	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}
*/
}