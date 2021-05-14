package com.jk.controller;

import com.jk.bean.TreeBean;
import com.jk.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 描述
 *
 * @author ghh
 * @date 2021/05/13 12:50:27
 */
@Controller
@RequestMapping("/food")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/")
    @ResponseBody
    public List<TreeBean> test(){
        return demoService.test();
    }
}
