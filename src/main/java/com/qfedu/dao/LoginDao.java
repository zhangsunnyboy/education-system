package com.qfedu.dao;


import com.qfedu.entity.Staff;
import com.qfedu.entity.Student;
import com.qfedu.entity.User;

public interface LoginDao {
    public User login(String no);
    public Staff findByNo(String u_no);
    public Student findByNoStu(String u_no);
}
