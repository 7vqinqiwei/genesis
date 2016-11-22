package com.flame.provider.good.service.impl;

import com.flame.core.service.impl.BaseServiceImpl;
import com.flame.model.Goods;
import com.flame.provider.good.mapper.GoodsMapper;
import com.flame.provider.good.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sungang on 2016/10/21.
 */
@Service
public class GoodsServiceImpl extends BaseServiceImpl<Goods> implements GoodsService {

    private final GoodsMapper goodsMapper;

    public GoodsServiceImpl(GoodsMapper goodsMapper) {
        super(goodsMapper);
        this.goodsMapper = goodsMapper;
    }
}
