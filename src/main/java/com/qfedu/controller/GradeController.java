package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.qfedu.common.JsonResult;
import com.qfedu.entity.Grade;
import com.qfedu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * projectName: system
 * author: 张宁
 * time: 2020/9/29 16:10
 * description:
 */
@Controller
@RequestMapping("/grade")
public class GradeController {
    @Autowired
    private GradeService gradeService;
    @RequestMapping("/insertGrade.do")
    @ResponseBody
    public JsonResult insertGrade(Grade grade) {
        gradeService.insertGrade(grade);
        return new JsonResult(1, "添加成功");
    }

    /**
     *
     * @param page
     * @param limit
     * @return 返回班级信息
     */

    @RequestMapping("/selectGradeAll.do")
    @ResponseBody
    public Map<String ,Object> selectGradeAll(Integer page,Integer limit){
        List<Grade> list = gradeService.selectGradeAll(page, limit);
        long total = ((Page) list).getTotal();
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",total);
        map.put("data",list);
        return map;
    }

    @RequestMapping("/delectGradeById.do")
    @ResponseBody
    public JsonResult delectGradeById(int id){
        gradeService.delectGradeById(id);
        return new JsonResult(1,"删除成功");
    }

    @RequestMapping("/updateGrade.do")
    @ResponseBody
    public JsonResult updateGrade(Grade grade){
        gradeService.updateGrade(grade);
        return new JsonResult(1,"修改成功");
    }
}
