package com.example.studentapp.repository;

import com.example.studentapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long>{
    
}