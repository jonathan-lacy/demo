package com.example.demo.repo;

import com.example.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    List<Student> students = List.of(new Student(1, "Peter"),
                                     new Student(2, "Paul"),
                                     new Student(3, "Mary"),
                                     new Student(4, "Anne"));

    public List<Student> findAll() {
        return students;
    }

    public Student find(Integer studentId) {
        return students.stream().filter(student -> student.id().equals(studentId)).findFirst().orElse(null);
    }


}
