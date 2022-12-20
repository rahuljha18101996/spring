package com.demo.spring.services;

import com.demo.spring.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student addStudent(Student student);
    Optional<Student> getStudent(int id);
    List<Student> getStudents();
}
