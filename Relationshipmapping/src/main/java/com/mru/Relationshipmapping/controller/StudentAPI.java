package com.mru.Relationshipmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mru.Relationshipmapping.entity.Student;
import com.mru.Relationshipmapping.service.StudentService;



@RestController
@RequestMapping("/student")
public class StudentAPI {

    @Autowired
    StudentService studentService;
    

    @PostMapping("/create")
    Student createStudent(@RequestBody Student student){

        return studentService.createStudent(student);
    }

    @GetMapping("/get")
    List<Student> gStudentList(){
        return studentService.getStudents();
    }


    

}