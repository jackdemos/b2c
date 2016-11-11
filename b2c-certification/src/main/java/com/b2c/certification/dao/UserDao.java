package com.b2c.certification.dao;


import com.b2c.domain.user.User;

import java.util.Set;

/**
 * Created by Oakley on 2016-11-10.
 */
public interface UserDao {

    /**
     * 通过用户名查询用户
     * @param userName
     * @return
     */
    public User getByUserName(String userName);

    /**
     * 通过用户名查询角色信息
     * @param userName
     * @return
     */
    public Set<String> getRoles(String userName);

    /**
     * 通过用户名查询权限信息
     * @param userName
     * @return
     */
    public Set<String> getPermissions(String userName);
}
