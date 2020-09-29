package com.qfedu.entity;

/**
 * projectName: system
 * author: 张宁
 * time: 2020/9/25 16:14
 * description:
 */
public class Exercises {
    private Integer id;
    private String category;
    private String equestion;
    private String eanswer;
    private Integer flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEquestion() {
        return equestion;
    }

    public void setEquestion(String equestion) {
        this.equestion = equestion;
    }

    public String getEanswer() {
        return eanswer;
    }

    public void setEanswer(String eanswer) {
        this.eanswer = eanswer;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
