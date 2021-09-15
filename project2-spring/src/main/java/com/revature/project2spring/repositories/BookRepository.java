package com.revature.project2spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.project2spring.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}