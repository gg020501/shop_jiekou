package com.fh.shop.dao;

import com.fh.shop.entity.po.ShuxingValue;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface shuxingvalueDao {

    @Select("select * from dianshang_shuxingvalue where isdel = 1 and attid = #{id} ")
    List<ShuxingValue> selectsxvalue(Integer id);

    @Delete("update dianshang_shuxingvalue  set isdel = 2 where id = #{id}")
    void deletesxvalueById(Integer id);

    @Insert("insert into dianshang_shuxingvalue (name,namech,isdel,attid) value(#{name},#{namech},1,#{attid})")
    void insertsxvalue(ShuxingValue shuxingValue);

    @Select("select * from dianshang_shuxingvalue where isdel = 1 and id = #{id} ")
    ShuxingValue seletesxvalueById(Integer id);

    @Update("update dianshang_shuxingvalue set name = #{name},namech=#{namech},isdel=#{isdel},attid=#{attid} where id = #{id}")
    void updatesxvalue(ShuxingValue shuxingValue);

    @Select("select * from dianshang_shuxingvalue where attid = #{id} and isdel = 1")
    List<ShuxingValue> selectsxvalueattid(Integer id);
}