package com.fh.shop.service;

import com.fh.shop.entity.po.Goods;
import com.fh.shop.entity.vo.Params;

import java.util.Map;

public interface goodsService {


    void insertgoods(Goods goods);

    void deletegoodsbyid(Integer id);

    Goods selectgoodsbyid(Integer id);

    void updategoods(Goods goods);

    Map insertattrssku(Goods goods, String attrs, String sku);

    Map selectgoodsj(Params params);
}
