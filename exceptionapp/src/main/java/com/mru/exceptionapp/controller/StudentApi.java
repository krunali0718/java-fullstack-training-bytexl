package com.mru.exceptionapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mru.exceptionapp.dto.Studentdto;
import com.mru.exceptionapp.entity.Student;
import com.mru.exceptionapp.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentApi {
    
    @Autowired
    StudentService studentService;

   
    @GetMapping("/get")
    List<Student> getStudentList(){

        return studentService.getStudentList();

    }


    @PostMapping("/create")
    Student createStudent(@Valid @RequestBody Studentdto studentdto){

        return studentService.createStudent(studentdto);

    }
}
