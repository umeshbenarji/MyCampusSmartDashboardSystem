package com.smartclass.dashboard.repository;

import com.smartclass.dashboard.entity.Timetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimetableRepository extends JpaRepository<Timetable, Integer> {

    List<Timetable> findByDay(String day);
}
