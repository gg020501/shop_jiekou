package com.fh.shop.service;

import com.fh.shop.entity.vo.Params;

import java.util.Map;

public interface shuxingService {
    Map selectshuxingAll(Params params);

    void deleteshuxing(Integer id);
}
