package cuc.waimai.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:config/spring/applicationContext.xml"})
public class ShopServiceTest {
    @Autowired
    ShopService shopService;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void selectByPrimaryKey() {
        System.out.println(shopService.selectByPrimaryKey(3));
    }

    @Test
    public void selectAll() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}