package com.example.swaggerdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.swaggerdemo.entity.Student;

@Service
public class StudentService {

    public Student createStudent(Student student) {
        return student;
    }

    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Ummed Singh", "ummed@gmail.com")
        );
    }
}