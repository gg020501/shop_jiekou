package com.fh.shop.dao;

import com.fh.shop.entity.po.Shuxing;
import com.fh.shop.entity.vo.Params;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface shuxingDao {

    @Select("<script> select count(*) from dianshang_shuxing where isdel = 1" +
            "<if test = 'name != null and name != &quot;&quot;' > and name = #{name}</if>" +
            " limit #{start},#{size} </script>")
    Integer selectshuxingCount(Params params);

    @Select("<script> select * from dianshang_shuxing where isdel = 1" +
            "<if test='name != null and name != &quot;&quot;'> and name = #{name}</if>" +
            " limit #{start},#{size} </script>")
    List<Shuxing> selectshuxingAll(Params params);
}
