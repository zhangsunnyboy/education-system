package com.qfedu.controller;

import com.qfedu.common.JsonResult;
import com.qfedu.entity.Student;
import com.qfedu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * projectName: system
 * author: 张宁
 * time: 2020/9/29 10:27
 * description:
 */
@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/insertStudent.do")
    @ResponseBody
    public JsonResult insertStudent(Student student){
        studentService.insertStudent(student);
        return new JsonResult(1,"添加成功！");
    }
}
