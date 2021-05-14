package com.jk.dao;

import com.jk.bean.TreeBean;
import com.jk.bean.FoodBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 描述
 *
 * @author ghh
 * @date 2021/05/12 19:53:38
 */
@Mapper
public interface FoodDao2 {
    List<TreeBean> queryTree(int pid);

    List<FoodBean> queryList(FoodBean food);

    void addfood(FoodBean food);


    FoodBean findById(int id);

    void del(String id);

    void updatefood(FoodBean food);
}
