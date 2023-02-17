package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final IStudentRepository studentRepository;

    @Autowired
    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        // return List.of(new Student(1L, "Mariam", "marian.jamal@gmail.com", 32,
        // LocalDate.of(2000, Month.JANUARY, 12)));

        return studentRepository.findAll();
    }

}
