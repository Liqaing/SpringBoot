package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// Repository provide methods (CRUD) to interact with database
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
