package com.mru.exceptionapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mru.exceptionapp.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

    
} 