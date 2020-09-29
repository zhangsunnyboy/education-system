package com.qfedu.service.impl;

import com.github.pagehelper.PageHelper;
import com.qfedu.dao.GradeDao;
import com.qfedu.entity.Grade;
import com.qfedu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: system
 * author: 张宁
 * time: 2020/9/29 16:04
 * description:
 */
@Service
public class GradeServiceImpl implements GradeService {
   @Autowired
   private GradeDao gradeDao;
    @Override
    public void insertGrade(Grade grade) {
        if(grade ==null){
            throw new RuntimeException("无信息");
        }
        gradeDao.insertGrade(grade);
    }




    @Override
    public List<Grade> selectGradeAll(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Grade> grades = gradeDao.selectGradeAll();
        return grades;
    }


}
