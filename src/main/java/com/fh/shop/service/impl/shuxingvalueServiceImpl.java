package com.fh.shop.service.impl;

import com.fh.shop.dao.shuxingvalueDao;
import com.fh.shop.entity.po.ShuxingValue;
import com.fh.shop.service.shuxingvalueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class shuxingvalueServiceImpl implements shuxingvalueService {

    @Resource
    private shuxingvalueDao shuxingvaluedao;

    @Override
    public List<ShuxingValue> selectsxvalue(Integer id) {
        return shuxingvaluedao.selectsxvalue(id);
    }

    @Override
    public void deletesxvalueById(Integer id) {
        shuxingvaluedao.deletesxvalueById(id);
    }

    @Override
    public void insertsxvalue(ShuxingValue shuxingValue) {
        shuxingvaluedao.insertsxvalue(shuxingValue);
    }

    @Override
    public ShuxingValue seletesxvalueById(Integer id) {
        return shuxingvaluedao.seletesxvalueById(id);
    }

    @Override
    public void updatesxvalue(ShuxingValue shuxingValue) {
        shuxingvaluedao.updatesxvalue(shuxingValue);
    }

    @Override
    public List<ShuxingValue> selectsxvalueattid(Integer id) {
        return shuxingvaluedao.selectsxvalueattid(id);
    }


}
