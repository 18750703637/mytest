package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemsService {
    /***
     * 查询所有
     * @return
     */
    List<Items> list();

    /***
     * 保存操作
     * @param items
     * @return
     */
    int save(Items items);
}
