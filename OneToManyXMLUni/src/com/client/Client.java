package com.client;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.beans.Author;
import com.beans.Book;
import com.beans.Cart;
import com.beans.Item;



public class Client {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		
		Set<Author> howToProgramWithJavaAuthor = new HashSet<Author>();
		Set<Author> howToProgramWithJava2ndAuthors = new HashSet<Author>();
		Set<Author> howToPlayGuitarAuthor = new HashSet<Author>();
		
		Author author = new Author();
		author.setAuthorName("Trevor Page");
		howToProgramWithJavaAuthor.add(author);
		
		Author author2 = new Author();
		author2.setAuthorName("John Doe");
		
		
		howToProgramWithJava2ndAuthors.add(author);
		howToProgramWithJava2ndAuthors.add(author2);
		howToPlayGuitarAuthor.add(author2);
		
		Book book = new Book();
		book.setBookName("How to Program with Java");

		Book book2 = new Book();
		book2.setBookName("How to Program with Java 2nd Edition");

		Book book3 = new Book();
		book3.setBookName("How to Play Guitar");

		book.setAuthors(howToProgramWithJavaAuthor);
		book2.setAuthors(howToProgramWithJava2ndAuthors);
		book3.setAuthors(howToPlayGuitarAuthor);
		

		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
	
		session.save(book);
		session.save(book2);
		session.save(book3);
		txn.commit();
		factory.close();
	}
}
