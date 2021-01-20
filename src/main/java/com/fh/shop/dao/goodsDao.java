package com.fh.shop.dao;

import com.fh.shop.entity.po.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

public interface goodsDao {
    @Insert("insert into dianshang_goods (name,title,bandid,typeid,productdecs,price,imgpath,stocks,sortnum,createdate,updatedate,author,isdel)" +
            " value(#{name},#{title},#{bandid},#{typeid},#{productdecs},#{price},#{imgpath},#{stocks},#{sortnum},#{createate},#{updatedate},#{author},#{isdel})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void insertgoods(Goods goods);

    @Delete("update dianshang_goods set isdel = 2 where id = #{id} ")
    void deletegoodsbyid(Integer id);

    @Select("select * from dianshang_goods where isdel = 1 and id = #{id}")
    Goods selectgoodsbyid(Integer id);
}
