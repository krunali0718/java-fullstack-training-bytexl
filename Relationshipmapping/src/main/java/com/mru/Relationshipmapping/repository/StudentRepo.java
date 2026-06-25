package com.mru.Relationshipmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mru.Relationshipmapping.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

    
}


