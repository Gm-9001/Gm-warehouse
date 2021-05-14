package com.jk.controller;

import com.jk.bean.TreeBean;
import com.jk.bean.FoodBean;
import com.jk.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("food")
public class FoodController {
    @Autowired
    FoodService foodService;

@RequestMapping("queryTree")
    public List<TreeBean> queryTree(){
    return foodService.queryTree();
}
@RequestMapping("queryList")
public List<FoodBean> queryList(FoodBean food){
    return foodService.queryList(food);
}
@RequestMapping("addfood")
    public void addfood(@RequestBody FoodBean food){
    foodService.addfood(food);
}
    @RequestMapping("findById")
    public FoodBean findById(int id){
        return   foodService.findById(id);
    }
    @RequestMapping("del")
    public void del(String id){
        foodService.del(id);
    }

}
