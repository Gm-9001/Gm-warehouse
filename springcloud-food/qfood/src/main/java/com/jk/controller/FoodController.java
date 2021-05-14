package com.jk.controller;

import com.jk.bean.FoodBean;
import com.jk.bean.TreeBean;
import com.jk.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述
 *
 * @author ghh
 * @date 2021/05/12 19:53:03
 */
@RestController
@RequestMapping(value = "/food2")
public class FoodController {
    @Autowired
    FoodService foodService;

    @GetMapping(value = "/queryTree")
    public List<TreeBean> queryTree() {
        return foodService.queryTree();
    }

    @GetMapping("/queryList")
    public List<FoodBean> queryList(FoodBean food) {
        return foodService.queryList(food);
    }

    @PostMapping("/apfood")
    public void apfood(FoodBean food) {
        foodService.apfood(food);
    }

    @GetMapping("/findById")
    public FoodBean findById(int id) {
        return foodService.findById(id);
    }

    @PostMapping("/del")
    public void delFood(String ids) {
        foodService.del(ids);
    }
}
