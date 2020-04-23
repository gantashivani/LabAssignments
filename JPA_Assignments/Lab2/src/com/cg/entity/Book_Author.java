package com.cg.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookAuthor")
public class Book_Author implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int ISBN;
	private int id;
	
	public int getISBN() {
		return ISBN;
	}
	
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
