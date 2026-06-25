package com.example.crudapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudapp.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    
}