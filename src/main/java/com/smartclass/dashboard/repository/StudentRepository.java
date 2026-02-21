package com.smartclass.dashboard.repository;

import com.smartclass.dashboard.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByRfidUid(String rfidUid);
}

