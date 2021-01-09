package com.offcn.dao;

import com.offcn.pojo.Goods;

import java.util.List;

public interface GoodsDao {
    List<Goods> selectAll();

    void insert(Goods goods);

    Goods selectGoodsByid(String gid);

    void update(Goods goods);
}
