package com.demo.spring.controllers;

import com.demo.spring.entity.Student;
import com.demo.spring.exception.StudentNotFoundException;
import com.demo.spring.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    @Qualifier("studentServiceImpl")

    /*
     * @Qualifier
     * To make a specified bean Primary
     * */
    private StudentService studentService;

    /*
    * Autowired
    * IoC will create the object of annoted object
    * */

    //@RequestMapping(value = "/save",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
    @PostMapping("/save")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.addStudent(student));
    }

    /*
    * @RequestBody
    * It is used to map the Json with the Object.
    * It is used for Payload
     * */

//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Student>> getStudent(@PathVariable int id) throws StudentNotFoundException {
@GetMapping("/get")
public ResponseEntity<Optional<Student>> getStudent(@RequestParam("id") int id) throws StudentNotFoundException {
        Optional<Student> student = studentService.getStudent(id);
        if (student.isPresent()) {
            return ResponseEntity.ok(student);
        }else {
            throw new StudentNotFoundException(String.format("Student not found with id %d",id));
        }
    }

    /*
    * @PathVariable
    * Provide value as a part of URL
    * */

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(studentService.getStudents());
    }
}
