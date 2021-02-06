package com.fh.shop.service.impl;

import com.fh.shop.dao.quanxianDao;
import com.fh.shop.entity.po.Quanxian;
import com.fh.shop.service.quanxianService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class quanxianServiceImpl implements quanxianService {
    @Resource
    private quanxianDao quanxiandao;

    @Override
    public void updateQx(Quanxian quanxian) {
         quanxiandao.updateQx(quanxian);
    }

    @Override
    public void insertQx(Quanxian quanxian) {
         quanxiandao.insertQx(quanxian);
    }

    @Override
    public void deleteQx(Integer id) {
        quanxiandao.deleteQx(id);
    }

    @Override
    public List<Quanxian> selectQxAll() {
        return quanxiandao.selectQxAll();
    }
}
