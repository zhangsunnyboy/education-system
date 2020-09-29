package com.qfedu.dao;


import com.qfedu.entity.Grade;

import java.util.List;

public interface GradeDao {
    public void insertGrade(Grade grade);
    public List<Grade> selectGradeAll();
    public void delectGradeById(int id);
    public void updateGrade(Grade grade);
}
