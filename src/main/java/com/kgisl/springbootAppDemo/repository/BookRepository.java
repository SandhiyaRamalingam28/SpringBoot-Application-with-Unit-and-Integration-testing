package com.kgisl.springbootAppDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.springbootAppDemo.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{
    
}
