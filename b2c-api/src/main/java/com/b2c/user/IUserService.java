package com.b2c.user;

import com.b2c.base.result.Result;
import com.b2c.domain.user.User;

import java.util.List;

/**
 * Created by Oakley on 2016-04-20.
 */
public interface IUserService {
    /**
     * 获取用户(精确匹配)
     * @param id
     * @return
     */
    Result<User> getUserById(String id);

    /**
     * 根据用户名获取用户信息(模糊匹配方式)
     * @param name
     * @return
     */
    Result<List<User>> getUsersByName(String name);

    /**
     * 创建用户
     * @param user
     * @return
     */
    Result<String> insertUser(User user);

    /**
     * 修改用户密码
     * @param userId
     * @param password
     * @return
     */
    Result<Boolean> updatePasswordByUserId(String userId,String password);

    /**
     * 修改用户资料
     * @param user
     * @return
     */
    Result<Boolean> updateUserInfoById(User user);

    /**
     * 检测用户是否为空
     * @param user
     * @return
     */
    Result<String> checkUser(User user);

}
