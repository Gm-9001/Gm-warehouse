package com.jk.service;

import com.jk.bean.FoodBean;
import com.jk.bean.TreeBean;

import java.util.List;

/**
 * 描述
 *
 * @author ghh
 * @date 2021/05/12 19:53:52
 */
public interface FoodService {
    List<TreeBean> queryTree();

    List<FoodBean> queryList(FoodBean food);

    void apfood(FoodBean food);

    FoodBean findById(int id);

    void del(String ids);
}
