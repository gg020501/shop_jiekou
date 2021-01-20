package com.fh.shop.controller;

import com.fh.shop.entity.po.ShuxingValue;
import com.fh.shop.service.shuxingvalueService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/shuxingvalue")
public class shuxingvalueController{

    @Resource
    private shuxingvalueService shuxingvalueservice;
    Map map = new HashMap();

    @PostMapping("selectsxvalue")
    public Map selectsxvalue(Integer id){
        List<ShuxingValue> lists = shuxingvalueservice.selectsxvalue(id);
        map.put("data",lists);
        map.put("code",200);
        map.put("message","success");
        return map;
    }

    @PostMapping("deletesxvalueById")
    public Map deletesxvalueById(Integer id){
        shuxingvalueservice.deletesxvalueById(id);
        map.put("code",200);
        map.put("message","success");
        return map;
    }

    @PostMapping("insertsxvalue")
    public Map insertsxvalue(ShuxingValue shuxingValue){
        if(shuxingValue.getId()!=null){
            map.put("code",201);
            shuxingvalueservice.updatesxvalue(shuxingValue);
        }else{
            map.put("code",200);
            shuxingvalueservice.insertsxvalue(shuxingValue);
        }
        map.put("message","success");
        return map;
    }

    @PostMapping("seletesxvalueById")
    public Map seletesxvalueById(Integer id){
        ShuxingValue shuxingValue = shuxingvalueservice.seletesxvalueById(id);
        map.put("code",200);
        map.put("message","success");
        map.put("data",shuxingValue);
        return map;
    }

    @GetMapping("selectsxvalueattid")
    public List<ShuxingValue> selectsxvalueattid(Integer id){
        List<ShuxingValue> lists = shuxingvalueservice.selectsxvalueattid(id);
        return lists;
    }



}
