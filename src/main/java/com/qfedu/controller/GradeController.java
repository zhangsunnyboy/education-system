package com.qfedu.controller;

import com.qfedu.common.JsonResult;
import com.qfedu.entity.Grade;
import com.qfedu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * projectName: system
 * author: 张宁
 * time: 2020/9/29 16:10
 * description:
 */
@Controller
@RequestMapping("grade")
public class GradeController {
    @Autowired
    private GradeService gradeService;
    @RequestMapping("/insertGrade.do")
    @ResponseBody
    public JsonResult insertGrade(Grade grade) {
        gradeService.insertGrade(grade);
        return new JsonResult(1, "添加成功");
    }
}
