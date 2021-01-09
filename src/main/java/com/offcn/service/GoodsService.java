package com.offcn.service;

import com.offcn.pojo.Goods;
import org.springframework.stereotype.Service;

import java.util.List;

public interface GoodsService {
    List<Goods> queryAll();

    void save(Goods goods);

    Goods selectGoodsByid(String gid);

    void update(Goods goods);
}
