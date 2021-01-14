package com.fh.shop.service;

import com.fh.shop.entity.po.Pinpai;
import com.fh.shop.entity.vo.Params;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

public interface pinpaiService {



    void selectpinpaiInsert(Pinpai pinpai);

    void delectpinpaiById(Integer id);

    Pinpai selectpinpaiById(Integer id);

    void pinpaiUpdate(Pinpai pinpai);

    Map selectpinpaiAll(Params params);
}
