package com.fh.shop.controller;

import com.fh.shop.entity.po.Goods;
import com.fh.shop.entity.po.productAttrDatas;
import com.fh.shop.entity.vo.Params;
import com.fh.shop.service.goodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/goods")
public class goodsController {

    @Resource
    private goodsService goodsservice;
    Map map = new HashMap();

    @PostMapping("insertgoods")
    public Map insertgoods(Goods goods){
        goods.setUpdatedate(new Date());
        if(goods.getId() != null ){
            goodsservice.updategoods(goods);
            map.put("code",200);
            map.put("message","success");
        }else{
            goods.setCreateate(new Date());
            goodsservice.insertgoods(goods);
            map.put("Id",goods.getId());
            map.put("code",200);
            map.put("message","success");
        }
        return map;
    }

    @GetMapping("deletegoodsbyid")
    public Map deletegoodsbyid(Integer id){
        goodsservice.deletegoodsbyid(id);
        map.put("code",200);
        map.put("message","success");
        return map;
    }

    @PostMapping("selectgoodsbyid")
    public Map selectgoodsbyid(Integer id){
        Goods goods = goodsservice.selectgoodsbyid(id);
        map.put("code",200);
        map.put("message","success");
        map.put("data",goods);
        return map;
    }

    @PostMapping("insertattrssku")
    public Map insertattrssku(Goods goods,String attrs,String sku){
        Map insertattrssku = goodsservice.insertattrssku(goods, attrs, sku);
        return insertattrssku;
    }

    @PostMapping("selectgoodsj")
    public Map selectgoodsj(Params params){
        Map map1 =  goodsservice.selectgoodsj(params);
        return map1;
    }

    @GetMapping("selectproductproid")
    public Map selectproductproid(Integer id){
        List<productAttrDatas> lists = goodsservice.selectproductproid(id);
        map.put("code",200);
        map.put("message","success");
        map.put("data",lists);
        return map;
    }

    @GetMapping("queryAttrDataByTypeId")
    public Map queryAttrDataByTypeId(Integer typeid){
        Map map1 = goodsservice.queryAttrDataByTypeId(typeid);
        return map1;
    }

}
