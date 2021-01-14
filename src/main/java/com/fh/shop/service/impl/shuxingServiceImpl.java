package com.fh.shop.service.impl;

import com.fh.shop.dao.shuxingDao;
import com.fh.shop.entity.po.Shuxing;
import com.fh.shop.entity.vo.Params;
import com.fh.shop.service.shuxingService;
import com.sun.javafx.collections.MappingChange;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class shuxingServiceImpl implements shuxingService {

    @Resource
    private shuxingDao shuxingdao;

    @Override
    public Map selectshuxingAll(Params params) {
        Map map = new HashMap();
    /*    if(params.getPage() != null){
            params.setStart((params.getPage()-1)*params.getSize());
        }else{
            params.setStart((params.getStart()-1)*params.getSize());
        }*/
        Integer count = shuxingdao.selectshuxingCount(params);
        List<Shuxing> shuxings = shuxingdao.selectshuxingAll(params);
        map.put("code",200);
        map.put("count",count);
        map.put("message","success");
        map.put("data",shuxings);
        return map;
    }
}
