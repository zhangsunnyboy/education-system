package com.qfedu.service;

import com.qfedu.entity.Student;

public interface StudentService {
     void insertStudent(Student student);
     int selectIdByName(String name);

}
