package com.itheima;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class ServiceTest {
    public static void main(String[] args) {
        //加载dao配置
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        //获取bean对象
        ItemsService itemsService = (ItemsService)applicationContext.getBean("itemsServiceImpl");
        //调用方法操作
        /*List<Items> list = itemsService.list();
        //输出结果
        for (Items items : list) {
            System.out.println(items);
        }*/

        //保存
        Items items = new Items();
        items.setName("苹果手机");
        items.setPrice(1f);
        items.setPic("1.jpg");
        items.setCreatetime(new Date());
        items.setDetail("1块钱都觉得贵");
        int rs = itemsService.save(items);
        System.out.println(rs);
    }
}

