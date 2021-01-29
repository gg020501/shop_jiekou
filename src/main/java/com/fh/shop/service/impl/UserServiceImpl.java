package com.fh.shop.service.impl;

import com.fh.shop.dao.UserDao;
import com.fh.shop.entity.po.User;
import com.fh.shop.service.UserService;
import com.fh.shop.utils.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public Map insertUser(User user) {
        Map map = new HashMap();
        User username = userDao.selectName(user.getName());
        if(username == null ){
            String encoder = MD5Util.encoder(user.getName());
            String encoder1 = MD5Util.encoder(user.getPassword());
            user.setPassword(encoder+encoder1);
            user.setCreatedate(new Date());
            user.setUpdatedate(new Date());
            userDao.insertUser(user);
            map.put("code","200");
        }else{
            //账号已存在
            map.put("code","500");
            map.put("message","账号已存在");
        }
        return map;
    }

    @Override
    public Map loginUser(String name, String password) {
        Map map = new HashMap();
        User username = userDao.selectName(name);
        if(username != null){
            String encoder = MD5Util.encoder(name);
            String encoder1 = MD5Util.encoder(password);
            if(username.getPassword().equals(encoder+encoder1)){
                //登录成功
                map.put("code","200");
            }else{
                //密码不正确
                map.put("code","501");
            }
        }else{
            //账号不存在
            map.put("code","500");
        }
        return map;
    }

    @Override
    public User selectName(String name) {
        User username = userDao.selectName(name);
        return  username;
    }
}
