package com.offcn.service;

import com.offcn.dao.GoodsDao;
import com.offcn.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> queryAll() {

        return goodsDao.selectAll();
    }

    @Override
    public void save(Goods goods) {
        goodsDao.insert(goods);
    }

    @Override
    public Goods selectGoodsByid(String gid) {
        return goodsDao.selectGoodsByid(gid);
    }

    @Override
    public void update(Goods goods) {
        goodsDao.update(goods);
    }
}
