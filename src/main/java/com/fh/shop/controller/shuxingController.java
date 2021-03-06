package com.fh.shop.controller;

import com.fh.shop.entity.po.Shuxing;
import com.fh.shop.entity.vo.Params;
import com.fh.shop.service.shuxingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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

    @PostMapping("deleteshuxing")
    public Map deleteshuxing(Integer id){
        shuxingservice.deleteshuxing(id);
        map.put("code",200);
        map.put("message","success");
        return map;
    }

    @PostMapping("insertshuxing")
    public Map insertshuxing(Shuxing shuxing){
        shuxing.setCreateDate(new Date());
        shuxing.setUpdateDate(new Date());
        shuxingservice.insertshuxing(shuxing);
        map.put("code",200);
        map.put("message","success");
        map.put("dataId",shuxing.getId());
        return map;
    }

    @PostMapping("selectshuxingById")
    public Map selectshuxingById(Integer id){
        Shuxing shuxing = shuxingservice.selectshuxingById(id);
        map.put("code",200);
        map.put("message","success");
        map.put("data",shuxing);
        return map;
    }

    @PostMapping("updateshuxing")
    public Map updateshuxing(Shuxing shuxing){
        shuxing.setUpdateDate(new Date());
        shuxingservice.updateshuxing(shuxing);
        map.put("code",200);
        map.put("message","success");
        return map;
    }

    @GetMapping("selecttypebyid")
    public List<Shuxing> selecttypebyid(Integer typeid){
        List<Shuxing> lists = shuxingservice.selecttypebyid(typeid);
        return lists;
    }


}
