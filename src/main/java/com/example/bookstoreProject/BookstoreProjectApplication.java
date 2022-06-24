package com.example.bookstoreProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.bookstoreProject.entity.Author;
import com.example.bookstoreProject.entity.Book;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.xml.crypto.Data;

import com.vaadin.exampledata.DataType;
import com.vaadin.exampledata.ExampleDataGenerator;
import com.example.bookstoreProject.repository.AuthorRepository;
import com.example.bookstoreProject.repository.BookRepository;

@SpringBootApplication
public class BookstoreProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreProjectApplication.class, args);	
	}

	@Bean
	public CommandLineRunner createAuthorDataIfNeeded(AuthorRepository repo) {
    	return args -> {
        	if(repo.count() == 0) {
            	var generator = new ExampleDataGenerator<>(Author.class, LocalDateTime.now());
            	generator.setData(Author::setBio, DataType.SENTENCE);
				generator.setData(Author::setFirst_name, DataType.FIRST_NAME);
				generator.setData(Author::setLast_name, DataType.LAST_NAME);
				generator.setData(Author::setPublisher, DataType.COMPANY_NAME);

				List<Author> authors = generator.create(100, new Random().nextInt());
			
				repo.saveAll(authors);
       	 	}
		};

	}

	// @Bean
	// public CommandLineRunner createBookDataIfNeeded(BookRepository bookRepo, AuthorRepository authorRepo) {
    // 	return args -> {
    //     	if(bookRepo.count() == 0) {
    //         	var generator = new ExampleDataGenerator<>(Book.class, LocalDateTime.now());
	// 			generator.setData(Book::setAuthor, authorRepo.findById(0 + (long)(Math.random() * (100 - 0))));
	// 			generator.setData(Author::setLast_name, DataType.LAST_NAME);
	// 			generator.setData(Author::setPublisher, DataType.COMPANY_NAME);

	// 			List<Book> books = generator.create(1000, new Random().nextInt());
			
	// 			repo.saveAll(books);
    //    	 	}
	// 	};

	// }
	
}


