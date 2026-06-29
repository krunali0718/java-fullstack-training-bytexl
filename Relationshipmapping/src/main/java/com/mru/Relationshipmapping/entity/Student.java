package com.mru.Relationshipmapping.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {


   @Id
   @GeneratedValue
   private Long id;

   private String name;


   @OneToOne
   @JoinColumn(name = "aadhar_id")
   private AadharCard aadharCard;

   @ManyToOne
   @JoinColumn(name = "dept_id")
   private Department department;


   @ManyToMany
   @JoinTable(
           name = "student_course",
           joinColumns =
           @JoinColumn(name = "student_id"),
           inverseJoinColumns =
           @JoinColumn(name = "course_id")
   )
   private List<Course> courses;
}