package com.demo.spring.repository;

import com.demo.spring.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MyStudentRepo implements StudentRepository {
    private List<Student> myList;
    public MyStudentRepo() {
        myList = new ArrayList<>();
        addFew();
    }

    private void addFew() {
        myList.add(new Student(101,"Raja Hindustani","Civil"));
        myList.add(new Student(102,"Piyush Bhawsar","CS"));
    }


    @Override
    public Student save(Student student) {
        myList.add(student);
        return student;
    }

    @Override
    public Optional<Student> findById(int id) {
        Optional<Student> student = Optional.empty();
        for (Student s : myList) {
            if (s.getId() == id) {
                student = Optional.of(s);
            }
        }
        return student;
    }

    @Override
    public List<Student> findAll() {
        return myList;
    }
}
