package com.fh.shop.dao;

import com.fh.shop.entity.po.Role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface roleDao {
    @Select("select * from dianshang_role where isdel = 1")
    List<Role> selectRoleAll();
    @Insert("insert into dianshang_role (name,isdel,createate,author) value(#{name},1,#{createate},#{author})")
    void insertRole(Role role);
    @Update("update dianshang_role set name = #{name},author=#{author} where id = #{id}")
    void updateRole(Role role);
    @Update("update dianshang_role set isdel = 2 where id= #{id}")
    void deleteRole(Integer id);
}
