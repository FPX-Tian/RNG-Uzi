package com.bdqn.meitao.pojo;

public class Area {
    private Integer areaid;

    private String areaname;

    private Integer pAreaid;

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public Integer getpAreaid() {
        return pAreaid;
    }

    public void setpAreaid(Integer pAreaid) {
        this.pAreaid = pAreaid;
    }
}