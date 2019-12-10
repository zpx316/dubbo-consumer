package zp.learn.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zp.learn.dubbo.bean.Order;
import zp.learn.dubbo.bean.User;
import zp.learn.dubbo.service.UserService;

/**
 * @author zp
 * @Description:
 * @date 2019-12-03 12:30
 */
@Controller
public class TestController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/hello")
    public Order test() {

        User user = new User();
        user.setUserName("zhangsan");
        Order order = userService.getNewMovie(user);
        return order;
    }
}