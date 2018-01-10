package com.iqmsoft.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iqmsoft.entities.Book;

public interface BookDao extends JpaRepository<Book, Integer> {
}
