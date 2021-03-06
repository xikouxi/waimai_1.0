package cuc.waimai.controller.usercontroller;

import cuc.waimai.entity.User;
import cuc.waimai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class UserRegController {
    @Autowired
    UserService userService;
    @RequestMapping("/userReg.do")
    @ResponseBody

    public int userReg(@RequestParam("userName") String userName,
                       @RequestParam("userPsw") String userPsw,
                       @RequestParam("userTel") String userTel) {
        User user = new User();
        user.setUserName(userName);
        user.setUserPsd(userPsw);
        user.setUserTel(userTel);
        user.setUserPortrait("resources/img/logo.png");
        user.setUserCreatetime(new Date());
        return userService.insert(user);
    }
}
