package com.example.crudapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import com.example.crudapp.entity.Student;
import com.example.crudapp.service.StudentService;



@RestController
@RequestMapping("/api")
public class StudentApi {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    String createStudent(@RequestBody Student student){

        studentService.createStudent(student);
        return "Create student api....";
    }

    @GetMapping("/get")
    List<Student> getStudent(){

        List<Student> studentList = studentService.getStudents();
        return studentList;
    }

    @GetMapping("/get/{id}")
    Optional<Student> getStudent(@PathVariable int id){

        Optional<Student> student = studentService.getStudent(id);
        return student;
    }

    @DeleteMapping("/delete/{id}")
    String deleteStudent(@PathVariable int id){

        studentService.deleteStudent(id);
        return "Student deleted succesfully....";
    }


    @PutMapping("/update")
    ResponseEntity<Student> updateStudent(@RequestBody Student student){
        Student updatedStudent = studentService.updateStudent(student);

        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }















}