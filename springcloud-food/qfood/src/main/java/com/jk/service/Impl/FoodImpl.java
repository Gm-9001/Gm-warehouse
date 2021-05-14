package com.jk.service.Impl;

import com.jk.bean.FoodBean;
import com.jk.bean.TreeBean;
import com.jk.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

/**
 * 描述
 *
 * @author ghh
 * @date 2021/05/12 19:54:05
 */
@Service
public class FoodImpl implements FoodService {
    @Autowired
    private RestTemplate restTemplate;


    @Override
    public List<TreeBean> queryTree() {
        return restTemplate.getForObject("http://provider/food/queryTree", List.class);
    }

    @Override
    public List<FoodBean> queryList(FoodBean food) {
        HashMap<String, Object> map = new HashMap<>();
/*        map.put("page",page);
        map.put("rows",rows);*/
        map.put("fname", food.getFname());
        map.put("startTime", food.getStartTime());
        map.put("endTime", food.getEndTime());
        return restTemplate.getForObject("http://provider/food/queryList?fname={fname}&startTime={startTime}&endTime={endTime}", List.class, map);

        //查询 get请求
        // return restTemplate.getForObject("http://provider/food/queryList?fname={1}&startTime={2}&endTime={3}",List.class,food.getFname(),food.getStartTime(),food.getEndTime());
    }

    @Override
    public void apfood(FoodBean food) {
        restTemplate.postForLocation("http://provider/food/addfood", food);
    }

    @Override
    public FoodBean findById(int id) {
        return restTemplate.getForObject("http://provider/food/findById?id={1}", FoodBean.class, id);
    }

    @Override
    public void del(String ids) {
        restTemplate.delete("http://provider/food/del?id={1}", ids);
    }
}
