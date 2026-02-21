package com.smartclass.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartclass.dashboard.entity.LibraryBook;

public interface LibraryBookRepository extends JpaRepository<LibraryBook, Integer> {
}
