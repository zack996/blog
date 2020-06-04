package cn.huntbuy.blog.controller;

import cn.huntbuy.blog.domain.User;
import cn.huntbuy.blog.result.CodeMsg;
import cn.huntbuy.blog.result.Result;
import cn.huntbuy.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import javax.annotation.Resource;
import java.util.Objects;

@Controller
public class LoginController {
    @Resource
    UserService userService;

    @CrossOrigin
    @RequestMapping("api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser){
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username, requestUser.getPassword());
        if (user==null) {
            String message = "账号密码错误";
            return new Result(CodeMsg.PASSWORD_ERROR);
        } else {
            return Result.success("登陆成功");
        }
    }
}
