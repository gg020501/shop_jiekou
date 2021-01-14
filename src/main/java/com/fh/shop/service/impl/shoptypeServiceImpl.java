package com.fh.shop.service.impl;

import com.fh.shop.dao.shoptypeDao;
import com.fh.shop.entity.po.Shoptype;
import com.fh.shop.service.shoptypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class shoptypeServiceImpl implements shoptypeService {

    @Resource
    private shoptypeDao shoptypedao;

    @Override
    public List<Shoptype> selectstypeAll() {
        return shoptypedao.selectstypeAll();
    }

    @Override
    public List<Shoptype> selectstypeByPid(Integer pid) {
        return shoptypedao.selectstypeByPid(pid);
    }

    @Override
    public void selectstypeInsert(Shoptype shoptype) {
         shoptypedao.selectstypeInsert(shoptype);
    }

    @Override
    public void shoptypeUpdate(Shoptype shoptype) {
        shoptypedao.shoptypeUpdate(shoptype);
    }

    @Override
    public Shoptype selectstypeByid(Integer id) {
        return shoptypedao.selectstypeByid(id);
    }

    @Override
    public void stypeDeleteId(Integer id) {
        shoptypedao.stypeDeleteId(id);
    }
}
