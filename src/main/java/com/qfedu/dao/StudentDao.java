package com.qfedu.dao;

import com.qfedu.entity.Student;

/**
 * projectName: system
 * author: 张宁
 * time: 2020/9/29 9:22
 * description:
 */
public interface StudentDao {
    void insertStudent(Student student); //添加用户信息
    int selectIdByName(String name);
}
