package com.keyvin.demo.model.dao;

import com.keyvin.demo.model.entity.User;

/**
 * @author weiwh
 * @date 2019/10/25 11:43
 */
public interface UserDao {
    User findById(Integer id);
}
