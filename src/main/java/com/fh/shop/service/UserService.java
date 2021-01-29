package com.fh.shop.service;

import com.fh.shop.entity.po.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    Map insertUser(User user);

    Map loginUser(String name, String password);

    User selectName(String name);
}
