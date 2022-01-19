package com.wdm.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wdm
 * @create 2022-01-19 17:04
 **/
@Controller   //请求控制器
public class HelloController {

    @RequestMapping("/")     //将路径“/”和index.html页面联系起来
    public String index(){
        //返回视图名称
        return "index";
    }

    @RequestMapping("/target")  //将路径“/target”和target.html页面联系起来
    public String toTarget() {
        return "target";
    }
}

