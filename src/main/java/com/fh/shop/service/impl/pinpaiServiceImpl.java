package com.fh.shop.service.impl;

import com.fh.shop.dao.pinpaiDao;
import com.fh.shop.entity.po.Pinpai;
import com.fh.shop.entity.vo.Params;
import com.fh.shop.service.pinpaiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class pinpaiServiceImpl implements pinpaiService {

    @Resource
    private pinpaiDao pinpaidao;

    Map map = new HashMap();

    @Override
    public void selectpinpaiInsert(Pinpai pinpai) {
        pinpaidao.selectpinpaiInsert(pinpai);
    }

    @Override
    public void delectpinpaiById(Integer id) {
        pinpaidao.delectpinpaiById(id);
    }

    @Override
    public Pinpai selectpinpaiById(Integer id) {
        return pinpaidao.selectpinpaiById(id);
    }

    @Override
    public void pinpaiUpdate(Pinpai pinpai) {
        pinpaidao.pinpaiUpdate(pinpai);
    }

    @Override
    public Map selectpinpaiAll(Params params) {
        if(params.getPage() != null){
            params.setStart((params.getPage()-1)*params.getSize());
        }else{
            params.setStart((params.getStart()-1)*params.getSize());
        }
        Integer count = pinpaidao.selectpinpaiAllCount(params);
        List<Pinpai> pinpais = pinpaidao.selectpinpaiAll(params);
        map.put("count",count);
        map.put("data",pinpais);
        return map;
    }


}
