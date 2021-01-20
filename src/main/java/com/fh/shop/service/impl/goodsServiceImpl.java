package com.fh.shop.service.impl;

import com.fh.shop.dao.goodsDao;
import com.fh.shop.entity.po.Goods;
import com.fh.shop.service.goodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
}
