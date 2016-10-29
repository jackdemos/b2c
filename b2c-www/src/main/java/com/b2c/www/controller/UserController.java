package com.b2c.www.controller;

/**
 * Created by Oakley on 2016-04-26.
 */

import com.b2c.base.result.Result;
import com.b2c.base.result.ResultSupport;
import com.b2c.code.ResultCodeEnum;
import com.b2c.domain.user.User;
import com.b2c.payment.IPaymentService;
import com.b2c.user.IUserService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @Autowired
    IPaymentService paymentService;

    /**
     * produces = {"application/json;charset=UTF-8"} 解决返回中文乱码问题
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/getUserById", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getUserId(String userId) {
        return new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create()
                .toJson(userService.getUserById(userId));
    }

    @RequestMapping(value = "/createUser/{username}/{password}", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String createUser(@PathVariable("username") String username,@PathVariable("password") String password) {
        Result<String> result;
        if(username==null || username.trim().length()==0|| password==null||password.trim().length()==0){
            result = new ResultSupport<String>();
            result.setSuccess(true);
            result.setResultCode(ResultCodeEnum.SYS_PARAMS_NOTNULL.getCode());
            result.setMessage(ResultCodeEnum.SYS_PARAMS_NOTNULL.getDescription());
            result.setModel(null);
            return new Gson().toJson(result);
        }
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        result = userService.checkUser(user);
        if(ResultCodeEnum.SYS_PARAMS_NOTNULL.getCode() == result.getResultCode()){
            return new Gson().toJson(result);
        }
        Random rm = new Random();
        String userNumber = String.valueOf((1 + rm.nextDouble()) * Math.pow(10, 15));
        user.setUserNumber(userNumber);
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        String loginIP = getIpAddr(request);
        user.setLoginIP(loginIP);
        result = userService.insertUser(user);
        return new Gson().toJson(result);

    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");
        return modelAndView;
    }

    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    @RequestMapping(value = "/getAccount", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getAccount(){
       Result<Boolean> result =  paymentService.payment("6a6b963d-1288-11e6-9ce9-000c299da979","2FC349F434DO",29.000);
        return new Gson().toJson(result);
    }

    @RequestMapping(value = "/login/{username}/{password}", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String login(@PathVariable("username") String username,@PathVariable("password") String password){
        Result<User> result = userService.login(username,password);
        Gson gson =  new GsonBuilder().setDateFormat(" yyyy-MM-dd HH:mm:ss.SSS").create();
       return gson.toJson(result);
    }


}

