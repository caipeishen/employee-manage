package com.wu.service;

import com.wu.pojo.Admin;

/**
 * @Author: Cai Peishen
 * @Date: 2021/12/14 10:48
 * @Description:
 */
public interface AdminService {


    /**
     * 获取登录信息
     * @param username
     * @param password
     * @return
     */
    Admin login(String username, String password);
}
