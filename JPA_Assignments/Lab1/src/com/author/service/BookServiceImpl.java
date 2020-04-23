package com.author.service;

import java.util.List;

import com.author.dao.BookDao;
import com.author.dao.BookDaoImp;
import com.author.entity.Author;

public class BookServiceImpl implements BookService {

	 
	 private BookDao dao;

		public BookServiceImpl() {
			dao = new BookDaoImp();
		}


	@Override
	public void addAuthor(Author author) {
		dao.beginTransaction();
		dao.addAuthor(author);
		dao.commitTransaction();
	}

	@Override
	public Author getAuthorById(int uid) {
		Author author =dao.getAuthorById(uid);
		return author;
	}

	@Override
	public void updateData(Author author1) {
		dao.beginTransaction();
		dao.updateData(author1);
		dao.commitTransaction();
	}

	@Override
	public void deleteAuthor(int did) {
		dao.beginTransaction();
		dao.deleteAuthor(did);
		dao.commitTransaction();	
	}

	@Override
	public Author fetchById(int fid) {
		dao.beginTransaction();
		dao.fetchById(fid);
		dao.commitTransaction();
		return dao.fetchById(fid);
	}

	@Override
	public List<Author> fetchAllDetails() {
		dao.beginTransaction();
		dao.fetchAllDetails();
		dao.commitTransaction();
		return dao.fetchAllDetails();
	}


}
