package com.fh.shop.controller;

import com.fh.shop.entity.po.Quanxian;
import com.fh.shop.service.quanxianService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/quanxian")
public class quanxianController {
    @Resource
    private quanxianService quanxianservice;
    Map map = new HashMap();
    @PostMapping("insertOrUpdate")
    public Map insertOrUpdate(Quanxian quanxian){
        if(quanxian.getId() == null){
            quanxian.setPid(quanxian.getId());
            quanxian.setCreatedate(new Date());
            quanxianservice.insertQx(quanxian);
            map.put("code",200);
            map.put("message","新增成功");
            return map;
        }else{
            quanxianservice.updateQx(quanxian);
            map.put("code",200);
            map.put("message","修改成功");
            return map;
        }
    }

    @PostMapping("deleteQx")
    public Map deleteQx(Integer id){
        quanxianservice.deleteQx(id);
        map.put("code",200);
        map.put("message","删除成功");
        return map;
    }


    @PostMapping("selectQxAll")
    public Map selectQxAll(){
        List<Quanxian> list = quanxianservice.selectQxAll();
        map.put("data",list);
        map.put("code",200);
        map.put("message","success");
        return map;
    }


}
