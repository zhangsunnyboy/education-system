package com.qfedu.entity;

import java.util.Date;

/**
 * projectName: system
 * author: 张宁
 * time: 2020/9/25 16:28
 * description:
 */
public class Skill {
    private Integer id;
    private String content;
    private Date createtime;
    private String u_no;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getU_no() {
        return u_no;
    }

    public void setU_no(String u_no) {
        this.u_no = u_no;
    }
}
