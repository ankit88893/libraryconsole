package com.dxctraining.fictionbook.entities;

import javax.persistence.Entity;

import com.dxctraining.author.entities.Author;
import com.dxctraining.book.entities.*;

@Entity
public class FictionBook extends Book {

	String characterName;
	
	 public FictionBook(){
		
	}

	public FictionBook(String name, double cost, Author author,String characterName) {
		super(name,cost,author);
		this.characterName = characterName;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FictionBook other = (FictionBook) obj;
		if (characterName == null) {
			if (other.characterName != null)
				return false;
		} else if (!characterName.equals(other.characterName))
			return false;
		return true;
	}
	
	
}
