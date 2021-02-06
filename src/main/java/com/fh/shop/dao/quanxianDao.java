package com.fh.shop.dao;

import com.fh.shop.entity.po.Quanxian;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;


public interface quanxianDao {
    @Update("update dianshang_quanxian set pid = #{pid},name = #{name},url = #{url},type = #{type},pid = #{pid},author = #{author} where id = #{id}")
    void updateQx(Quanxian quanxian);
    @Insert("insert into dianshang_quanxian (pid,name,url,type,isdel,createdate,author)value(#{pid},#{name},#{url},#{type},1,#{createdate},#{author})")
    void insertQx(Quanxian quanxian);
    @Update("update dianshang_quanxian set isdel = 2 where id= #{id}")
    void deleteQx(Integer id);

    @Select("select * from dianshang_quanxian where isdel = 1")
    List<Quanxian> selectQxAll();
}
