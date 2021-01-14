package com.fh.shop.service;

import com.fh.shop.entity.po.Shoptype;

import java.util.List;

public interface shoptypeService {
    List<Shoptype> selectstypeAll();

    List<Shoptype> selectstypeByPid(Integer pid);

    void selectstypeInsert(Shoptype shoptype);

    void shoptypeUpdate(Shoptype shoptype);

    Shoptype selectstypeByid(Integer id);

    void stypeDeleteId(Integer id);
}
