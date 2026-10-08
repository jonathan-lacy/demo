package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {
    StudentRepository repository;
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }
    public Student findById(Integer id) {
        return repository.find(id);
    }

    public List<Student> findAll() {
        return repository.findAll();
    }
}
