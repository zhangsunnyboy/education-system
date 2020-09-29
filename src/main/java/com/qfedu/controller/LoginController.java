package com.qfedu.controller;

import com.qfedu.common.JsonResult;
import com.qfedu.entity.Staff;
import com.qfedu.entity.Student;
import com.qfedu.entity.User;
import com.qfedu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * projectName: system
 * author: 张宁
 * time: 2020/9/25 18:57
 * description:
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
   @RequestMapping("/login.do")
   @ResponseBody
   public JsonResult login(String no, String pass, HttpSession session){
       User user = loginService.login(no, pass);
       session.setAttribute("loginUser", user);
       return  new JsonResult(1,user.getIdentity());
   }

    /*
     * 查询登录用户的信息
     * */
    @RequestMapping("/findByNo.do")
    @ResponseBody
    public JsonResult findByNo(HttpSession session){
        User user = (User) session.getAttribute ("loginUser");
        System.out.println (user);
        String no = user.getNo ();
        System.out.println (no);
        Staff staff = loginService.findByNo (no);
        System.out.println (staff);
        return new JsonResult (1,staff);
    }
    @RequestMapping("/findByNoStu.do")
    @ResponseBody
    public JsonResult findByNoStu(HttpSession session){
        User user = (User) session.getAttribute ("loginUser");
        String no = user.getNo ();
        Student stu = loginService.findByNoStu (no);
        return new JsonResult (1,stu);
    }
}
