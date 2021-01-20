package com.fh.shop.service;

import com.fh.shop.entity.po.Shuxing;
import com.fh.shop.entity.vo.Params;

import java.util.List;
import java.util.Map;

public interface shuxingService {
    Map selectshuxingAll(Params params);

    void deleteshuxing(Integer id);

    void insertshuxing(Shuxing shuxing);

    Shuxing selectshuxingById(Integer id);


    void updateshuxing(Shuxing shuxing);

    List<Shuxing> selecttypebyid(Integer typeid);
}
