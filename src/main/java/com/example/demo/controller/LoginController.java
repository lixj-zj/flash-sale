package com.example.demo.controller;

import com.example.demo.annotation.MethodLog;
import com.example.demo.redis.RedisService;
import com.example.demo.result.Result;
import com.example.demo.service.MiaoshaUserService;
import com.example.demo.base.vo.LoginVo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @Description: 登录模块
 * --------------------------------------
 * @ClassName: LoginController.java
 * @Date: 2021/3/20 22:59
 * @SoftWare: IntelliJ IDEA
 * --------------------------------------
 * @Author: lixj
 * @Contact: lixj_zj@163.com
 **/
@Controller
@Slf4j
@RequestMapping("/login")
public class LoginController {

	@Autowired
	MiaoshaUserService userService;
	
	@Autowired
	RedisService redisService;

	/**
     * 跳转登录页面
     * */
    @RequestMapping("/to_login")
    public String toLogin() {
        return "login";
    }

    /**
     * 登录接口
     * */
    @RequestMapping("/do_login")
    @ResponseBody
    @MethodLog
    public Result<String> doLogin(HttpServletResponse response, @Valid LoginVo loginVo) {
    	log.info(loginVo.toString()+"登录~~~~");
    	// 登录
    	String token = userService.login(response, loginVo);
    	return Result.success(token);
    }
}
