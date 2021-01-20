package com.fh.shop.controller;

import com.fh.shop.entity.po.Goods;
import com.fh.shop.service.goodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
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
        goods.setCreateate(new Date());
        goods.setUpdatedate(new Date());
        goodsservice.insertgoods(goods);
        map.put("code",200);
        map.put("message","success");
        map.put("Id",goods.getId());
        return map;
    }

    @PostMapping("deletegoodsbyid")
    public Map deletegoodsbyid(Integer id){
        goodsservice.deletegoodsbyid(id);
        map.put("code",200);
        map.put("message","success");
        return map;
    }


}
