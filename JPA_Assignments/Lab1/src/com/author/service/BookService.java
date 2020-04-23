package com.author.service;

import java.util.List;

import com.author.entity.Author;

public interface BookService {

	void addAuthor(Author author);

	Author getAuthorById(int uid);

	void updateData(Author author1);

	void deleteAuthor(int did);

	Author fetchById(int fid);

	List<Author> fetchAllDetails();

}
