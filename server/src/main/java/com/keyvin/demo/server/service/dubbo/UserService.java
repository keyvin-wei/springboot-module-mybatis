package com.keyvin.demo.server.service.dubbo;

import com.keyvin.demo.model.entity.User;

/**
 * @author weiwh
 * @date 2019/10/25 11:56
 */
public interface UserService {
    User findById(Integer id);
}
