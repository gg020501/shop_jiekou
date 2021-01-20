package com.fh.shop.service;

import com.fh.shop.entity.po.Goods;

public interface goodsService {


    void insertgoods(Goods goods);

    void deletegoodsbyid(Integer id);

    Goods selectgoodsbyid(Integer id);
}
