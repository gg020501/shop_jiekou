package com.fh.shop.entity.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Params {
    // start （必传的）
    // size (必传的)
    // name
    //  birthdaymin（yyyy-MM-dd）
    //  birthdaymax（yyyy-MM-dd）
    //agemin
    //agemax
    private String name;
    private Integer start;
    private Integer size;
    //传参页数
    private Integer page;
    //复选框
    private String peoples;
    //type 单选
    private Integer type;
    //地区
    private Integer area;
    //集合
    private List<String> ps;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdaymin;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdaymax;

    private Integer agemin;
    private Integer agemax;

    public List<String> getPs() {
        return ps;
    }

    public void setPs(List<String> ps) {
        this.ps = ps;
    }


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getPeoples() {
        return peoples;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setPeoples(String peoples) {
        this.peoples = peoples;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Date getBirthdaymin() {
        return birthdaymin;
    }

    public void setBirthdaymin(Date birthdaymin) {
        this.birthdaymin = birthdaymin;
    }

    public Date getBirthdaymax() {
        return birthdaymax;
    }

    public void setBirthdaymax(Date birthdaymax) {
        this.birthdaymax = birthdaymax;
    }

    public Integer getAgemin() {
        return agemin;
    }

    public void setAgemin(Integer agemin) {
        this.agemin = agemin;
    }

    public Integer getAgemax() {
        return agemax;
    }

    public void setAgemax(Integer agemax) {
        this.agemax = agemax;
    }
}
