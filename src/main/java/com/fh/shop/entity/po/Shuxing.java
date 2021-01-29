package com.fh.shop.entity.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.relational.core.sql.In;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Shuxing {
    private  Integer id;//    主键
    private String name;//  属性名
    private String namech;//  属性中文名
    private Integer typeid;//   分类的主键
    private Integer type;//     属性的类型    0 下拉框     1 单选框      2  复选框   3  输入框
    private Integer issku;//  是否为sku属性
    private Integer isdel;//   逻辑删除
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;//
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateDate;//
    private String author;// 操作人


    //业务需要
    private List<ShuxingValue> values;

    public List<ShuxingValue> getValues() {
        return values;
    }

    public void setValues(List<ShuxingValue> values) {
        this.values = values;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamech() {
        return namech;
    }

    public void setNamech(String namech) {
        this.namech = namech;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIssku() {
        return issku;
    }

    public void setIssku(Integer issku) {
        this.issku = issku;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
