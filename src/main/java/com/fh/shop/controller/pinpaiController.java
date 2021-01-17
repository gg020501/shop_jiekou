package com.fh.shop.controller;

import com.fh.shop.entity.po.Pinpai;
import com.fh.shop.entity.vo.Params;
import com.fh.shop.service.pinpaiService;
import com.fh.shop.utils.OssFileUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("/api/pinpai")
public class pinpaiController {

    @Resource
    private pinpaiService pinpaiservice;

    @Resource
    private HttpServletRequest request;

    Map map = new HashMap();

    @PostMapping("selectpinpaiAll")
    public Map selectstypeAll(Params params){
        Map map1 = pinpaiservice.selectpinpaiAll(params);
        return map1;
    }

    @PostMapping("selectpinpaiInsert")
    public Map selectstypeAll(Pinpai pinpai){
        if(pinpai.getId() == null){
            pinpai.setCreatedate(new Date());
            pinpai.setUpdatedate(new Date());
            pinpaiservice.selectpinpaiInsert(pinpai);
            map.put("code",200);
            map.put("message","新增成功");
            map.put("data",pinpai.getId());
        }else{
            pinpai.setUpdatedate(new Date());
            pinpaiservice.pinpaiUpdate(pinpai);
            map.put("code",200);
            map.put("message","修改成功");
        }
        return map;
    }

    @PostMapping("delectpinpaiById")
    public Map delectpinpaiById(Integer id){
        pinpaiservice.delectpinpaiById(id);
        map.put("code",200);
        map.put("message","删除成功");
        return map;
    }

    @RequestMapping("insertimgpath")
    public Map insertimgpath(MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        String newName = UUID.randomUUID().toString()+originalFilename.substring(originalFilename.lastIndexOf("."));
        newName = "images/"+newName;
        String s = OssFileUtils.uploadFile(file.getInputStream(), newName);
        map.put("data",s);
        map.put("code",200);
        map.put("message","上传成功");
        return map;
    }

    @PostMapping("selectpinpaiById")
    public Map selectpinpaiById(Integer id){
        Pinpai pinpai = pinpaiservice.selectpinpaiById(id);
        map.put("code",200);
        map.put("message","success");
        map.put("data",pinpai);
        return map;
    }


}
