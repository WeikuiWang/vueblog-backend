package com.kui.pro.proj.controller;

import com.alibaba.fastjson.JSON;
import com.kui.pro.proj.model.dto.LoginDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author weikui.wang
 * @Date 2021/1/14 18:45
 */
@RestController
@RequestMapping("/api")
public class EnterController {

    @PostMapping(value = "/login")
    public String index(@Validated @RequestBody LoginDto loginDto, HttpServletResponse response) {
        return "hello:" + JSON.toJSONString(loginDto);
    }

}
