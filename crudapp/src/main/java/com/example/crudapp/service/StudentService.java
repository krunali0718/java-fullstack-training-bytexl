package com.example.crudapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudapp.entity.Student;
import com.example.crudapp.repository.StudentRepo;


@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;
    
    public String createStudent(Student student){

        studentRepo.save(student);
        return "Create student service....";
    }


    public List<Student> getStudents(){

        List<Student> studentList = studentRepo.findAll();
        return studentList;
    }

    public Optional<Student> getStudent(int id){

        Optional<Student> student = studentRepo.findById(id);
        return student;
    }

    public String deleteStudent(int id){

        studentRepo.deleteById(id);
        return "Student deleted succesfully....";
    }



    public Student updateStudent(Student student) {

        Optional<Student> existingstudentOpt = studentRepo.findById(student.getId());
        if (existingstudentOpt.isEmpty()) {
            return null;
        }

        Student existingstudent = existingstudentOpt.get();
        existingstudent.setName(student.getName());
        existingstudent.setEmail(student.getEmail());
        studentRepo.save(existingstudent);
        return existingstudent;

    }

    
}