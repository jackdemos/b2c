package com.b2c.certification.service;


import com.b2c.domain.user.User;

import java.util.Set;

/**
 * Created by Oakley on 2016-11-10.
 */
public interface UserService {

    /**
     *  通过用户名 查询用户
     * @param userName
     * @return
     */
    public User getByUserName(String userName);

    /**
     * 通过用户名 查询角色信息
     * @param userName
     * @return
     */
    public Set<String> getRoles(String userName);

    /**
     * 通过用户名 查询权限信息
     * @param userName
     * @return
     */

    public Set<String> getPermissions(String userName);
}
