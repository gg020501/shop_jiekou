package com.fh.shop.service;

import com.fh.shop.entity.po.Goods;
import com.fh.shop.entity.po.productAttrDatas;
import com.fh.shop.entity.vo.Params;

import java.util.List;
import java.util.Map;

public interface goodsService {


    void insertgoods(Goods goods);

    void deletegoodsbyid(Integer id);

    Goods selectgoodsbyid(Integer id);

    void updategoods(Goods goods);

    Map insertattrssku(Goods goods, String attrs, String sku);

    Map selectgoodsj(Params params);

    List<productAttrDatas> selectproductproid(Integer id);

    Map queryAttrDataByTypeId(Integer typeid);
}
