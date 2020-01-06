package com.bdqn.meitao.pojo;

import java.math.BigDecimal;

public class Product {
    private Integer productid;

    private String title;

    private String productdesc;

    private BigDecimal originalprice;

    private BigDecimal currentprice;

    private Integer areaid;

    private Integer shopid;

    private Integer categoryid;

    private String picture;

    private Integer salescount;

    private String iscommend;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc == null ? null : productdesc.trim();
    }

    public BigDecimal getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(BigDecimal originalprice) {
        this.originalprice = originalprice;
    }

    public BigDecimal getCurrentprice() {
        return currentprice;
    }

    public void setCurrentprice(BigDecimal currentprice) {
        this.currentprice = currentprice;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getSalescount() {
        return salescount;
    }

    public void setSalescount(Integer salescount) {
        this.salescount = salescount;
    }

    public String getIscommend() {
        return iscommend;
    }

    public void setIscommend(String iscommend) {
        this.iscommend = iscommend == null ? null : iscommend.trim();
    }
}