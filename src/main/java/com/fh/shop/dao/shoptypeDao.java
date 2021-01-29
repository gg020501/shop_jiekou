package com.fh.shop.dao;

import com.fh.shop.entity.po.Shoptype;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface shoptypeDao {
    @Select("select * from shop_type where isdel = 1")
    List<Shoptype> selectstypeAll();

    @Select("select * from shop_type where pid = #{pid}")
    List<Shoptype> selectstypeByPid(Integer pid);

    @Insert("insert into shop_type (name,pid,createdate,isdel,operate) values (#{name},#{pid},#{createdate},1,#{operate})")
    @Options(useGeneratedKeys = true , keyProperty = "id" , keyColumn = "id")
    void selectstypeInsert(Shoptype shoptype);


    /*"<if test='pid != null and pid !=&quot;&quot;'> , pid = #{pid}</if>" +
      "<if test='isdel != null and isdel !=&quot;&quot;'> , isdel = #{isdel}</if>" +*/
    @Update("<script> update shop_type set  updatedate = #{updatedate}" +
            "<if test='name != null and name !=&quot;&quot;'> , name = #{name}</if>" +
            " where id = #{id} </script>")
    void shoptypeUpdate(Shoptype shoptype);

    @Select("select * from shop_type where pid = #{id}")
    Shoptype selectstypeByid(Integer id);

    @Update("update shop_type set isdel = 2 where id = #{id}")
    void stypeDeleteId(Integer id);
}
