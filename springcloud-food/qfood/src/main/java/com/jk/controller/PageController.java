/**
 * <pre>项目名称:movie
 * 文件名称:PageController.java
 * 包名:com.jk.controller
 * 创建日期:2021年4月12日下午9:18:28
 * Copyright (c) 2021, yuxy123@gmail.com All Rights Reserved.</pre>
 */
package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>项目名称：movie
 * 类名称：PageController
 * 类描述：
 * 创建人：郭莫
 * 创建时间：2021年4月12日 下午9:18:28
 * 修改人：郭莫
 * 修改时间：2021年4月12日 下午9:18:28
 * 修改备注：
 * @version </pre>
 */
@Controller
@RequestMapping(value = "page")
public class PageController {

    @RequestMapping("show")
    public String show() {
        return "show";
    }

    @RequestMapping("show1")
    public String show1() {
        return "show1";
    }
}
