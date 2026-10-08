package com.example.demo.model;

import java.util.Date;
import java.util.List;

public record CourseSchedule(int id, Date startDate, Date endDate, List<Course> courses) {
}
