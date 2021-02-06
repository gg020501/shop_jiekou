package com.fh.shop.service;

import com.fh.shop.entity.po.Quanxian;

import java.util.List;

public interface quanxianService {
    void updateQx(Quanxian quanxian);

    void insertQx(Quanxian quanxian);

    void deleteQx(Integer id);

    List<Quanxian> selectQxAll();
}
