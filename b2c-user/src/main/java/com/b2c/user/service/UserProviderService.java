package com.b2c.user.service;

import com.alibaba.druid.util.StringUtils;
import com.b2c.base.result.Result;
import com.b2c.base.result.ResultSupport;
import com.b2c.code.ResultCodeEnum;
import com.b2c.domain.user.User;
import com.b2c.user.IUserService;
import com.b2c.user.dao.UserDao;
import com.b2c.vo.user.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Oakley on 2016-04-20.
 */
@Service("userService")
public class UserProviderService implements IUserService {

    @Autowired
    UserDao userDao;

    public Result<User> getUserById(String userId) {
        ResultSupport<User> result = new ResultSupport<User>();
        User user = userDao.getUserById(userId);
        user.setPassword("");
        result.setModel(user);
        result.processResult(true,result,ResultCodeEnum.SYS_SUCCESS.getCode(),ResultCodeEnum.SYS_SUCCESS.getDescription(),user);
        return result;
    }

    public Result<String> insertUser(User user) {
        ResultSupport<String> result = new ResultSupport<String>();
        String message = ResultCodeEnum.SYS_USER_EXISTS.getDescription();
        String userId = ResultCodeEnum.SYS_USER_EXISTS.getDescription();
        int code = ResultCodeEnum.SYS_USER_EXISTS.getCode();
        int count = userDao.getUserCountByUserName(user.getUserName());
        if (count <1) {
            user.setPassword(user.getPassword()+"b2cc2b");
            userDao.insertUser(user);
            userId = user.getId();
            message =ResultCodeEnum.SYS_USER_REGISTER_SUCCESS.getDescription();
            code = ResultCodeEnum.SYS_USER_REGISTER_SUCCESS.getCode();
        }
        result.processResult(true,result,code,message,userId);
        return result;

    }

    public Result<Boolean> updatePasswordByUserId(String userId, String password) {
        ResultSupport<Boolean> result = new ResultSupport<Boolean>();
        User user = new User();
        user.setId(userId);
        user.setPassword(password);
        Boolean flag = userDao.updatePasswordByUserId(user);

        result.processResult(true,result,ResultCodeEnum.SYS_SUCCESS.getCode(),ResultCodeEnum.SYS_SUCCESS.getDescription(),flag);
        return result;

    }

    public Result<Boolean> updateUserInfoById(User user) {
        ResultSupport<Boolean> result = new ResultSupport<Boolean>();
        boolean flag = userDao.updateUserById(user);
        result.processResult(true,result,ResultCodeEnum.SYS_SUCCESS.getCode(),ResultCodeEnum.SYS_SUCCESS.getDescription(),flag);
        return result;
    }


    public Result<List<User>> getUsersByName(String name) {
        ResultSupport<List<User>> result = new ResultSupport<List<User>>();
        List<User> userList = userDao.getUserByName(name);

        result.processResult(true,result,ResultCodeEnum.SYS_SUCCESS.getCode(),ResultCodeEnum.SYS_SUCCESS.getDescription(),userList);
        return result;
    }


    public Result<String> checkUser(User user){
        ResultSupport<String> result = new ResultSupport<String>();
        if(StringUtils.isEmpty(user.getUserName()) || StringUtils.isEmpty(user.getPassword())){
            result.processResult(true,result,ResultCodeEnum.SYS_PARAMS_NOTNULL.getCode(),ResultCodeEnum.SYS_PARAMS_NOTNULL.getDescription(),"参数不能为空");
        }
        return result;
    }

    public Result<User>  login(String userName,String password){
        Result<User> result =  new ResultSupport<User>();
        User user = userDao.login(userName);
        if(user==null || !user.getPassword().equals(password)){
            result.setResultCode(ResultCodeEnum.SYS_USER_PWD_ERROR.getCode());
            result.setMessage(ResultCodeEnum.SYS_USER_PWD_ERROR.getDescription());
            result.setSuccess(true);
            return result;
        }
        user.setPassword(null);
        result.setModel(user);
        result.setResultCode(ResultCodeEnum.SYS_SUCCESS.getCode());
        result.setMessage(ResultCodeEnum.SYS_SUCCESS.getDescription());
        result.setSuccess(true);
        return  result;
    }


}
