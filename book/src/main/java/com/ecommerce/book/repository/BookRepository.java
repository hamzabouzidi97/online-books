package com.ecommerce.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.book.models.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
