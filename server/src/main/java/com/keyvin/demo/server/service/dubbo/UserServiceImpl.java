package com.keyvin.demo.server.service.dubbo;

import com.keyvin.demo.model.dao.UserDao;
import com.keyvin.demo.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weiwh
 * @date 2019/10/25 11:57
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }
}
