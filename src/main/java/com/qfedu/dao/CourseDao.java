package com.qfedu.dao;

import com.qfedu.entity.Course;

import java.util.List;

public interface CourseDao {
    public void insertCourse(Course course);
    public List<Course> selectCourseAll();
}
