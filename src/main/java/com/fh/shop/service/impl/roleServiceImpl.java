package com.fh.shop.service.impl;

import com.fh.shop.entity.po.Role;
import com.fh.shop.service.roleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import com.fh.shop.dao.roleDao;

import java.util.List;

@Service
public class roleServiceImpl implements roleService {

    @Resource
    private roleDao roledao;

    @Override
    public List<Role> selectRoleAll() {
        return roledao.selectRoleAll();
    }

    @Override
    public void insertRole(Role role) {
        roledao.insertRole(role);
    }

    @Override
    public void updateRole(Role role) {
        roledao.updateRole(role);
    }

    @Override
    public void deleteRole(Integer id) {
        roledao.deleteRole(id);
    }
}
