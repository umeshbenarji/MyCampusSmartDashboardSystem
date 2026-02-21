package com.smartclass.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartclass.dashboard.entity.LibraryIssue;

public interface LibraryIssueRepository extends JpaRepository<LibraryIssue, Integer> {
}
