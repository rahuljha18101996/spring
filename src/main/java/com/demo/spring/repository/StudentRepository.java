package com.demo.spring.repository;

import com.demo.spring.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository {
    Student save(Student student);
    Optional<Student> findById(int id);
    List<Student> findAll();
}
