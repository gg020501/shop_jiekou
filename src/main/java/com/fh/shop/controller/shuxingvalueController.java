package com.fh.shop.controller;

import com.fh.shop.entity.po.ShuxingValue;
import com.fh.shop.service.shuxingvalueService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/shuxingvalue")
public class shuxingvalueController {

    @Resource
    private shuxingvalueService shuxingvalueservice;
    Map map = new HashMap();

    @PostMapping("selectsxvalue")
    public Map selectsxvalue(){
        List<ShuxingValue> lists = shuxingvalueservice.selectsxvalue();
        map.put("data",lists);
        return map;
    }

}
