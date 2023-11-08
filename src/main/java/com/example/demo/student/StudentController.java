/* This is an api layer
    a controller class to control api request and student class
*/
package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> student() {
        return List.of(
                new Student(
                        1,
                        "Rick",
                        19,
                        "r@gmail.com",
                        LocalDate.of(2004, Month.AUGUST, 19)
                )
        );
    }
}
