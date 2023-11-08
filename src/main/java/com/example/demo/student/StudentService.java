/* This is a service layer
    used for handle business logic and control student class (talk to data layer)
*/

package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent() {
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
