package com.qfedu.service.impl;

import com.qfedu.dao.LoginDao;
import com.qfedu.entity.Staff;
import com.qfedu.entity.Student;
import com.qfedu.entity.User;
import com.qfedu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: system
 * author: 张宁
 * time: 2020/9/25 19:09
 * description:
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;
    @Override
    public User login(String no, String pass) {
        User user = loginDao.login(no);
        if(user==null){
            throw new RuntimeException("账户错误");
        }else if (!user.getPassword().equals(pass)){
            throw new RuntimeException("密码错误");
        }
        return user;
    }

    @Override
    public Staff findByNo(String no) {
        Staff sta = loginDao.findByNo(no);
        System.out.println(no);
        System.out.println(sta);
        return sta;
    }

    @Override
    public Student findByNoStu(String no) {
        Student stu = loginDao.findByNoStu(no);
        return stu;
    }
}
