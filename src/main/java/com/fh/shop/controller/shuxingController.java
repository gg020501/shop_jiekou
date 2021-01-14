package com.fh.shop.controller;

import com.fh.shop.entity.vo.Params;
import com.fh.shop.service.shuxingService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/shuxing")
public class shuxingController {

    @Resource
    private shuxingService shuxingservice;
    Map map = new HashMap();


    @PostMapping("selectshuxingAll")
    public Map selectshuxingAll(Params params){
        Map rs = shuxingservice.selectshuxingAll(params);
        return rs;
    }
}
