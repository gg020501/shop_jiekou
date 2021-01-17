package com.fh.shop.dao;

import com.fh.shop.entity.po.ShuxingValue;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface shuxingvalueDao {

    @Select("select * from dianshang_shuxingvalue where 1 = 1 ")
    List<ShuxingValue> selectsxvalue();


}
