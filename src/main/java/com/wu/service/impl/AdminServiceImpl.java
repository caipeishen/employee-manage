package com.wu.service.impl;

import com.wu.mapper.AdminMapper;
import com.wu.pojo.Admin;
import com.wu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录serivce
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 根据用户密码登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public Admin login(String username, String password) {
        return this.adminMapper.login(username, password);
    }
}
