package com.bdqn.meitao.pojo;

public class Category {
    private Integer categoryid;

    private String categoryname;

    private Integer pCategoryid;

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public Integer getpCategoryid() {
        return pCategoryid;
    }

    public void setpCategoryid(Integer pCategoryid) {
        this.pCategoryid = pCategoryid;
    }
}