package cuc.waimai.mapper;

import cuc.waimai.entity.FoodShop;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:config/spring/applicationContext.xml"})
public class FoodShopMapperTest {
    @Autowired
    FoodShopMapper foodShopMapper;

    @Test
    public void selectByFoodId() {
        System.out.print(foodShopMapper.selectByFoodId(1));
    }

    @Test
    public void selectByFoodIdAndShopId() {
        System.out.print(foodShopMapper.selectByFoodIdAndShopId(1, 1));
    }

    @Test
    public void update() {
        FoodShop foodShop=new FoodShop();
        foodShop.setFoodId(30);
        foodShop.setShopId(125);
        foodShop.setFoodPrice(Double.parseDouble("1"));
        foodShop.setFoodDes("wwwwwww");

        System.out.print(foodShopMapper.updateByPrimaryKey(foodShop));
    }
}