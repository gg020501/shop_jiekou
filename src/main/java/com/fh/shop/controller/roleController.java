package com.fh.shop.controller;

import com.fh.shop.entity.po.Role;
import com.fh.shop.service.roleService;
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
@RequestMapping("/api/role")
public class roleController {

    @Resource
    private roleService roleservice;
    Map map = new HashMap();
    @PostMapping("selectRoleAll")
    private Map selectRoleAll(){
        List<Role> list = roleservice.selectRoleAll();
        map.put("data",list);
        map.put("code",200);
        map.put("message","success");
        return map;
    }

    @PostMapping("insertOrUpdate")
    public Map insertOrUpdate(Role role){
        if(role.getId() == null){
            role.setCreateate(new Date());
            roleservice.insertRole(role);
            map.put("code",200);
            map.put("message","新增成功");
            return map;
        }else{
            roleservice.updateRole(role);
            map.put("code",200);
            map.put("message","修改成功");
            return map;
        }
    }
    @PostMapping("deleteRole")
    public Map deleteRole(Integer id){
        roleservice.deleteRole(id);
        map.put("code",200);
        map.put("message","删除成功");
        return map;
    }

}
