package com.b2c.certification.service.impl;

import com.b2c.certification.dao.UserDao;
import com.b2c.certification.service.UserService;
import com.b2c.domain.user.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * Created by Oakley on 2016-11-10.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public User getByUserName(String userName) {
        return userDao.getByUserName(userName);
    }

    @Override
    public Set<String> getRoles(String userName) {
        return userDao.getRoles(userName);
    }

    @Override
    public Set<String> getPermissions(String userName) {
        return userDao.getPermissions(userName);
    }
}
