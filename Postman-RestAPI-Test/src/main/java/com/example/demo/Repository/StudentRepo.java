package com.example.demo.Repository;

import com.example.demo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//importing info from "Student" class
public interface StudentRepo extends JpaRepository<Student, Integer> {


}
