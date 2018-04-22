package cuc.waimai.controller.shopcontroller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import java.util.Enumeration;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:config/spring/applicationContext.xml"})
public class ShopRegControllerTest {
@Autowired
    ShopRegController shopRegController;
@Autowired
ShopLoginController shopLoginController;
    @Test
    public void shopReg() {
        MockHttpSession session=new MockHttpSession();
        shopLoginController.shopLogin("123","12",session);
    }
}