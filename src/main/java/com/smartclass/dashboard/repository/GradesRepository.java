package com.smartclass.dashboard.repository;

import com.smartclass.dashboard.entity.Grades;
import com.smartclass.dashboard.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradesRepository extends JpaRepository<Grades, Integer> {

    List<Grades> findByStudent(Student student);
}
