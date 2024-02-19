package com.example.demo.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    //function: save & post data
    public Student saveDetails(Student student){
        return studentRepo.save(student);
    }

    public Student save(Student student) {
        return studentRepo.save(student);
    }
}
