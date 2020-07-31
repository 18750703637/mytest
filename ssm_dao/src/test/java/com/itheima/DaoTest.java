package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
//测试dao
public class DaoTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");

        ItemsDao itemsDao = (ItemsDao)applicationContext.getBean("itemsDao");

        List<Items> list = itemsDao.list();

        for (Items items : list) {
            System.out.println(items);
        }
    }
}
