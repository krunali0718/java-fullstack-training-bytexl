package com.mru.exceptionapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mru.exceptionapp.dto.Studentdto;
import com.mru.exceptionapp.entity.Student;
import com.mru.exceptionapp.repository.StudentRepo;

@Service
public class StudentService {
    

    @Autowired
    StudentRepo studentRepo;

    public Student createStudent(Student student){

        return studentRepo.save(student);
    }

    public List<Student> getStudentList(){

        return studentRepo.findAll();
    }

    public Student getStudent(int id){

        return studentRepo.findById(id).orElseThrow(()-> new RuntimeException("User Not Found with Id: "+ id));
    }
 
    public Student createStudent(Studentdto studentdto){

        Student student = new Student();
        student.setName(studentdto.getName());
        student.setEmail(studentdto.getEmail());
        student.setContact(studentdto.getContact());
        
        return studentRepo.save(student);
    }

    




}
