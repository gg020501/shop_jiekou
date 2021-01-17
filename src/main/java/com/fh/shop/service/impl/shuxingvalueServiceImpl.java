package com.fh.shop.service.impl;

import com.fh.shop.dao.shuxingvalueDao;
import com.fh.shop.entity.po.ShuxingValue;
import com.fh.shop.entity.vo.Params;
import com.fh.shop.service.shuxingvalueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class shuxingvalueServiceImpl implements shuxingvalueService {

    @Resource
    private shuxingvalueDao shuxingvaluedao;


    @Override
    public Map selectsxvalue(Params params) {



        return null;
    }
}
