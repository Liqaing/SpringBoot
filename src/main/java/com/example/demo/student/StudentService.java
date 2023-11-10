/* This is a service layer
    used for handle business logic and control student class (talk to data layer)
*/

package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentService {

    // Instant field store StudentRepository class reference
    private final StudentRepository studentRepository;

    // Dependency injection
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent() {
        // Select from database
        return studentRepository.findAll();
    }
}
