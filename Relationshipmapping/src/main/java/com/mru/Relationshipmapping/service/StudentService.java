package com.mru.Relationshipmapping.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mru.Relationshipmapping.entity.Student;

@Service
public class StudentService {
    
    @Autowired
    com.mru.Relationshipmapping.repository.StudentRepo studentRepo;

    public Student createStudent(Student student){

        return studentRepo.save(student);

    }

    public List<Student> getStudents(){

        return studentRepo.findAll();
    }

    


}