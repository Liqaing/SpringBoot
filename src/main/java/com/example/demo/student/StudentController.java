/* This is an api layer
    a controller class to control api request and talk to student service
*/
package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    // Instant field store StudentService class reference
    private final StudentService studentService;

    // Dependency injection: use autowired and service or component annotation. To late spring know to pass object here rather than create it manually
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> student() {
        return this.studentService.getStudent();
    }
}
