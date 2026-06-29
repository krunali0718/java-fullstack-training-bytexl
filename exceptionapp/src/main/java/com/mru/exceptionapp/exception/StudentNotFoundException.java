package com.mru.exceptionapp.exception;

public class StudentNotFoundException extends RuntimeException {


   public StudentNotFoundException(String message){
       super(message);
   }
}