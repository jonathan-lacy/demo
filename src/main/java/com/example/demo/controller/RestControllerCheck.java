package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
public class RestControllerCheck {
    private StudentService studentService;

    @GetMapping("/student/{studentId}")
    public Student getTestData(@PathVariable Integer studentId) {
        return studentService.find(studentId);
    }
    @GetMapping("/students")
    public List<Student> getTestData() {
        return studentService.findAll();
    }
}