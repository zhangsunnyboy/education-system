package com.qfedu.service;

import com.qfedu.entity.Grade;
import com.qfedu.entity.Student;
import com.qfedu.vo.StudentEcharts;

import java.util.List;

public interface StudentService {
     void insertStudent(Student student);
     int selectIdByName(String name);
     StudentEcharts selectStuAndGrade();


}
