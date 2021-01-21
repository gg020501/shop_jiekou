package com.fh.shop.service.impl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fh.shop.dao.goodsDao;
import com.fh.shop.entity.po.Goods;
import com.fh.shop.entity.po.productAttrDatas;
import com.fh.shop.entity.vo.Params;
import com.fh.shop.service.goodsService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.channels.SelectionKey;
import java.util.*;

@Service
public class goodsServiceImpl implements goodsService {

    @Resource
    private goodsDao dao;

    @Override
    public void insertgoods(Goods goods) {
        dao.insertgoods(goods);
    }

    @Override
    public void deletegoodsbyid(Integer id) {
        dao.deletegoodsbyid(id);
    }

    @Override
    public Goods selectgoodsbyid(Integer id) {
        return dao.selectgoodsbyid(id);
    }

    @Override
    public void updategoods(Goods goods) {
        dao.updategoods(goods);
    }

    @Override
    public Map insertattrssku(Goods goods, String attrs, String sku) {
        Map map = new HashMap();
        goods.setCreateate(new Date());
        goods.setUpdatedate(new Date());
        goods.setIsdel(1);
        dao.insertgoods(goods);

        List<productAttrDatas> datas = new ArrayList<productAttrDatas>();

        JSONArray objects = JSONObject.parseArray(attrs);
        for (int i = 0; i <objects.size() ; i++) {
            productAttrDatas pads=new productAttrDatas();
            pads.setProid(goods.getId());
            pads.setAttrdata(objects.get(i).toString());
            datas.add(pads);
        }
        JSONArray objectssku = JSONObject.parseArray(sku);
        for (int i = 0; i <objectssku.size() ; i++) {
            productAttrDatas padss=new productAttrDatas();
            JSONObject o = (JSONObject) objectssku.get(i);
            padss.setProid(goods.getId());
            padss.setPrice(o.getDouble("pricess"));
            padss.setStorcks(o.getInteger("storcks"));
            o.remove("price");
            o.remove("stocks");
            padss.setAttrdata(objectssku.get(i).toString());
            datas.add(padss);
        }
        dao.insertgoodslist(datas);
        map.put("code",200);
        map.put("message","success");
        return map;
    }

    @Override
    public Map selectgoodsj(Params params) {
        Map map = new HashMap();
        params.setStart((params.getStart()-1)*params.getSize());
        Integer count =  dao.selectgoodsjcount(params);
        List<Goods> selectgoodsj = dao.selectgoodsj(params);
        map.put("data",selectgoodsj);
        map.put("count",count);
        return map;
    }
}
