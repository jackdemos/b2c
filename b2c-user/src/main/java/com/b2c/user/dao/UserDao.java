package com.b2c.user.dao;

import com.b2c.domain.user.User;

import java.util.List;

/**
 * Created by Oakley on 2016-04-20.
 */
public interface UserDao {
    /**
     * 获取用户
     * @return
     */
    User getUserById(java.lang.String userId);

    /**
     * 获取用户
     * @param userName
     * @return
     */
    List<User> getUserByName(String userName);

    /**
     * 获取用户是否已存在
     * @param userName
     */
    int getUserCountByUserName(String userName);

    /**
     * 返回用户Id(表示成功)
     * @param user
     * @return
     */
    void insertUser(User user);

    /**
     *
     * @param user
     * @return
     */
    boolean updatePasswordByUserId(User user);

    boolean updateUserById(User user);

    /**
     * 用户登录
     * @param userName
     * @return
     */
    User login(String userName);
}
