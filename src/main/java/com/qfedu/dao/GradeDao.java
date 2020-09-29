package com.qfedu.dao;


import com.qfedu.entity.Grade;

import java.util.List;

public interface GradeDao {
    public void insertGrade(Grade grade);
    public List<Grade> selectGradeAll();
}
