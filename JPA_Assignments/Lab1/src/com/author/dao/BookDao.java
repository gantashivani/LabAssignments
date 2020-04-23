package com.author.dao;

import java.util.List;

import com.author.entity.Author;

public interface BookDao {

	void beginTransaction();

	void commitTransaction();

	void addAuthor(Author author);

	Author getAuthorById(int uid);

	void updateData(Author author1);

	void deleteAuthor(int did);

	Author fetchById(int uid);

	List<Author> fetchAllDetails();

	
	
}
