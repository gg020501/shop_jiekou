package com.fh.shop.controller;

import com.fh.shop.entity.po.Shoptype;
import com.fh.shop.service.shoptypeService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/api/stype")

public class shoptypeController {

    @Resource
    private shoptypeService shoptypeservice;
    Map map = new HashMap();


    @GetMapping("selectstypeAll")
    public Map selectstypeAll(){
        List<Shoptype> list = shoptypeservice.selectstypeAll();
        map.put("code",200);
        map.put("message","success");
        map.put("data",list);
        return map;
    }

    @GetMapping("selectstypeByPid")
    public Map selectstypeByPid(Integer pid){
        List<Shoptype> shoptype = shoptypeservice.selectstypeByPid(pid);
        map.put("code",200);
        map.put("message","success");
        map.put("data",shoptype);
        return map;
    }

    @PostMapping("selectstypeByid")
    public Map selectstypeByid(Integer id){
        Shoptype shoptype = shoptypeservice.selectstypeByid(id);
        map.put("code",200);
        map.put("message","success");
        map.put("data",shoptype);
        return map;
    }

    @PostMapping("selectstypeInsert")
    public Map selectstypeInsert(Shoptype shoptype){
        if(shoptype.getId() == null){
            shoptype.setCreatedate(new Date());
            shoptypeservice.selectstypeInsert(shoptype);
            map.put("code",200);
            map.put("message","success");
            map.put("data",shoptype.getId());
        }else{
            shoptype.setUpdatedate(new Date());
            shoptypeservice.shoptypeUpdate(shoptype);
            map.put("code",200);
            map.put("message","修改成功");
        }
        return map;
    }

    @PostMapping("stypeDeleteId")
    public Map stypeDeleteId(Integer id){
        shoptypeservice.stypeDeleteId(id);
        map.put("code",200);
        map.put("message","删除成功");
        return map;
    }

}