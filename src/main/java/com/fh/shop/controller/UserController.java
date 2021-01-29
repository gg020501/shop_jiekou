package com.fh.shop.controller;

import com.fh.shop.entity.po.User;
import com.fh.shop.service.UserService;
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
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("insertUser")
    private Map insertUser(User user){
        Map map = userService.insertUser(user);
        return map;
    }

    @PostMapping("loginUser")
    private Map loginUser(String name,String password){
        Map map = userService.loginUser(name,password);
        return map;
    }

    @PostMapping("selectName")
    public Map selectName(String name) {
        Map map=new HashMap();
        User li=userService.selectName(name);
        if (li == null){
            map.put("code","202");
            return map;
        }
        map.put("code","200");
        return map;
    }


}
