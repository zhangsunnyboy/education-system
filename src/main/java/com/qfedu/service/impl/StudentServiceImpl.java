package com.qfedu.service.impl;

import com.qfedu.dao.StudentDao;
import com.qfedu.entity.Student;
import com.qfedu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: system
 * author: 张宁
 * time: 2020/9/29 10:21
 * description:
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public void insertStudent(Student student) {
        if(student == null){
            throw new RuntimeException("无信息");
        }
        studentDao.insertStudent(student);

    }

    @Override
    public int selectIdByName(String name) {
        if (name == null) {
            throw new RuntimeException("name 不能为空");
        }
        int id = studentDao.selectIdByName(name);
        return id;
    }


}
