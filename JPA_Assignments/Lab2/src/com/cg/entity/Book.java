package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="bookdata")
public class Book {

	private int ISBN;
	private String title;
	private double price;
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
