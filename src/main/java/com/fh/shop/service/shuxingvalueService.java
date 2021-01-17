package com.fh.shop.service;

import com.fh.shop.entity.po.ShuxingValue;

import java.util.List;

public interface shuxingvalueService {
    List<ShuxingValue> selectsxvalue();

    void deletesxvalueById(Integer id);

    void insertsxvalue(ShuxingValue shuxingValue);

    ShuxingValue seletesxvalueById(Integer id);

    void updatesxvalue(ShuxingValue shuxingValue);
}
