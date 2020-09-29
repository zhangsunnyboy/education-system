package com.qfedu.entity;

import java.util.Date;

/**
 * projectName: system
 * author: 张宁
 * time: 2020/9/25 16:17
 * description:
 */
public class Grade {
    private Integer id;
    private String u_no;
    private String name;
    private Date createtime;
    private Integer week; //这个数据库里是int 你这里写的String 应该会报错 改成Integer
    private String location;
    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getU_no() {
        return u_no;
    }

    public void setU_no(String u_no) {
        this.u_no = u_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

}

