package com.fh.shop.service;

import com.fh.shop.entity.po.Role;

import java.util.List;

public interface roleService {
    List<Role> selectRoleAll();

    void insertRole(Role role);

    void updateRole(Role role);

    void deleteRole(Integer id);
}
