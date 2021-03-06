package com.wu.controller;

import com.wu.pojo.Admin;
import com.wu.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * 登录请求控制器
 */
@Api(tags = {"登录相关API"})
@Controller
public class LoginController {

    @Autowired
    private AdminService adminService;

    @ApiOperation(value="1.登录")
    @RequestMapping("/user/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model, HttpSession session) {

        // 获取登录信息
        Admin admin = this.adminService.login(username, password);
        if (admin != null) {
            session.setAttribute("loginuser", admin);
            return "redirect:/emps";
        } else {
            //告诉用户你登录失败了
            model.addAttribute("msg", "用户名或者密码错误");
            return "index";
        }
    }

    /**
     * 退出登录
     * @param session
     * @return
     */
    @ApiOperation(value="2.退出登录")
    @RequestMapping("/user/loginout")
    public String loginout(HttpSession session) {
        session.removeAttribute("loginuser");
        return "redirect:/index.html";
    }

}
