package com.b2c.certification.controller;

import com.b2c.domain.user.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Oakley on 2016-11-10.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request){
        System.out.println("进入login方法");
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPassword());
        try{
            subject.login(token);
            Session session = subject.getSession();
            System.out.println("登录成功");
            return "redirect:/success.jsp";
        }catch (Exception e){
            e.printStackTrace();
            request.setAttribute("user",user);
            request.setAttribute("errorMsg","用户名或密码错误");
            return "login";
        }
    }
}
