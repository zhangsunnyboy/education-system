package com.qfedu.service;


import com.qfedu.entity.Staff;
import com.qfedu.entity.Student;
import com.qfedu.entity.User;


/**
 * projectName: system
 * author: 张宁
 * time: 2020/9/25 18:59
 * description:
 */
public interface LoginService  {
    public User login(String no,String pass);
    public Staff findByNo(String no);
    public Student findByNoStu(String no);

}
