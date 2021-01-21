package com.fh.shop.dao;

import com.fh.shop.entity.po.Goods;
import com.fh.shop.entity.po.productAttrDatas;
import com.fh.shop.entity.vo.Params;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface goodsDao {
    @Insert("insert into dianshang_goods (name,title,bandid,typeid,productdecs,price,imgpath,stocks,sortnum,createdate,updatedate,author,isdel)" +
            " value(#{name},#{title},#{bandid},#{typeid},#{productdecs},#{price},#{imgpath},#{stocks},#{sortnum},#{createate},#{updatedate},#{author},#{isdel})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void insertgoods(Goods goods);

    @Delete("update dianshang_goods set isdel = 2 where id = #{id} ")
    void deletegoodsbyid(Integer id);

    @Select("select * from dianshang_goods where isdel = 1 and id = #{id}")
    Goods selectgoodsbyid(Integer id);

    @Update("update dianshang_goods set name=#{name},title = #{title}, typeid= #{typeid},bandid = #{bandid}, imgpath= #{imgpath}, productdecs= #{productdecs}, price= #{price}, stocks= #{stocks},sortnum = #{sortnum},updatedate = #{updatedate}, author= #{author},isdel= #{isdel} where id = #{id}")
    void updategoods(Goods goods);

    @Insert("<script>insert into dianshang_productdttrdatas (proid,attrdata,storcks,price) values" +
            "<foreach collection='list' item='a' separator=','> (#{a.proid},#{a.attrdata},#{a.storcks},#{a.price})" +
            "</foreach> </script>")
    void insertgoodslist(List<productAttrDatas> list);

    @Select("<script>select * from dianshang_goods where isdel=1  " +
            "<if test='name != null and name !=&quot;&quot;'> and name = #{name} </if>" +
            " order by sortnum desc limit #{start} , #{size} </script>")
    List<Goods> selectgoodsj(Params params);

    @Select("select count(*) from dianshang_goods where isdel = 1")
    Integer selectgoodsjcount(Params params);
}
