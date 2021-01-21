package com.fh.shop.entity.po;

public class productAttrDatas {
    private Integer id;
    private Integer proid;
    private String attrdata; // {"1":3,"2":9}
    private Integer storcks;
    private Double price;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public String getAttrdata() {
        return attrdata;
    }

    public void setAttrdata(String attrdata) {
        this.attrdata = attrdata;
    }

    public Integer getStorcks() {
        return storcks;
    }

    public void setStorcks(Integer storcks) {
        this.storcks = storcks;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
