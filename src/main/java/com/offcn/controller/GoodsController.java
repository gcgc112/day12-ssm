package com.offcn.controller;

import com.offcn.pojo.Goods;
import com.offcn.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("goods")// /和.do可以缺省
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    //查询所有
    @RequestMapping("findAll")
    public String findAll(Model model) {
        List<Goods> list = goodsService.queryAll();
        model.addAttribute("list", list);
        return "goodslist";
    }

    //保存
    @RequestMapping("save")
    public String save(Goods goods) {
        goodsService.save(goods);
        return "redirect:/goods/findAll.do";
    }

    //去修改页面
    @RequestMapping("showupdate")
    public String update(String gid, Model model) {
        //获取从页面传来的gid
        //System.out.println("gid = " + gid);
        Goods goods = goodsService.selectGoodsByid(gid);
        model.addAttribute("goods", goods);
        return "goodsupdate";
    }

    @RequestMapping("update")
    public String update(Goods goods) {
        //获取从页面传来的信息
        //System.out.println("goods = " + goods);
        goodsService.update(goods);
        return "redirect:/goods/findAll.do";
    }

    @RequestMapping("delete")
    public String delete() {
        return "goodslist";
    }

    @RequestMapping("showsave")
    public String showsave() {
        return "goodssave";
    }
}
