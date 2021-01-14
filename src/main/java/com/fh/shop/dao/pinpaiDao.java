package com.fh.shop.dao;

import com.fh.shop.entity.po.Pinpai;
import com.fh.shop.entity.vo.Params;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface pinpaiDao {

    @Select("<script> select * from dianshang_pinpai where isdel = 1 " +
            "<if test='name != null and name != &quot;&quot;'> and name = #{name} </if>" +
            " order by ord desc limit #{start},#{size}</script>")
    List<Pinpai> selectpinpaiAll(Params params);

    @Select("<script> select count(*) from dianshang_pinpai where isdel = 1 " +
            "</script>")
    Integer selectpinpaiAllCount(Params params);

    @Insert("insert into dianshang_pinpai (name,bande,imgpath,banddesc,ord,isdel,createdate,updatedate,author)values(#{name},#{bande},#{imgpath},#{banddesc},#{ord},1,#{createdate},#{updatedate},#{author}) ")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void selectpinpaiInsert(Pinpai pinpai);

    @Delete("update dianshang_pinpai set isdel = 2 where id = #{id}")
    void delectpinpaiById(Integer id);

    @Select("select * from dianshang_pinpai where isdel = 1 and id = #{id} ")
    Pinpai selectpinpaiById(Integer id);

    @Update("update dianshang_pinpai set name=#{name},bande=#{bande},imgpath=#{imgpath},banddesc=#{banddesc},ord=#{ord},updatedate=#{updatedate},author=#{author} where id = #{id}")
    void pinpaiUpdate(Pinpai pinpai);


}
