package com.example.demo.model;

import java.util.List;

public record StudentCourses(int studentId, List<Course> courses) {
}
