package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;


    /*****
     * 列表访问
     * @return
     */
    @RequestMapping("/list")
    public String list(Model model){
        //集合查询
        List<Items> items = itemsService.list();
        //存入回显
        model.addAttribute("items",items);
        return "items";
    }


    /***
     * 增加商品
     * @return
     */
    @RequestMapping(value = "/save")
    public String save(Items items){
        int account =  itemsService.save(items);
        //集合列表页跳转
        return "redirect:/items/list";
    }
}
