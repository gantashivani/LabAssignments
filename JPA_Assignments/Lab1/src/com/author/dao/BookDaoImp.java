package com.author.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.author.entity.Author;


public class BookDaoImp implements BookDao {

	private EntityManager entityManager;


	public BookDaoImp() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public void addAuthor(Author author) {
		entityManager.persist(author);
	}

	@Override
	public Author getAuthorById(int uid) {
	Author author = entityManager.find(Author.class,uid);
		return author;
	}

	@Override
	public void updateData(Author author1) {
		entityManager.merge(author1);
	}

	@Override
	public void deleteAuthor(int did) {
		entityManager.remove(getAuthorById(did));	
	}

	@Override
	public Author fetchById(int uid) {
		Author author = entityManager.find(Author.class,uid);
		return author;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Author> fetchAllDetails() {
		Query q=entityManager.createQuery("select a from Author a");
		List<Author> l= q.getResultList();
		return l;
	}
}

