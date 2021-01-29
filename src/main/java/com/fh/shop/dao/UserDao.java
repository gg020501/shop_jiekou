package com.fh.shop.dao;

import com.fh.shop.entity.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from t_user where isdel = 1 and name = #{name}")
    User selectName(String name);

    @Insert("insert into t_user (name,realname,password,sex,phone,idcard,birthday,imgurl,eduid,deptid,createdate,updatedate,isdel) value(#{name},#{realname},#{password},#{sex},#{phone},#{idcard},#{birthday},#{imgurl},#{eduid},#{deptid},#{createdate},#{updatedate},1)")
    void insertUser(User user);
}
