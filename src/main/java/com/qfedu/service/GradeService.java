package com.qfedu.service;

import com.qfedu.entity.Grade;

import java.util.List;

public interface GradeService {
    public void insertGrade(Grade grade);
    public List<Grade> selectGradeAll(Integer page, Integer limit);
    public void delectGradeById(int id);


}
