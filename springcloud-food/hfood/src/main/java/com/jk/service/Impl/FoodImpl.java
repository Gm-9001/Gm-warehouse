package com.jk.service.Impl;

import com.jk.bean.FoodBean;
import com.jk.bean.TreeBean;
import com.jk.dao.FoodDao2;
import com.jk.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
  FoodDao2 foodDao2;

    @Override
    public List<TreeBean> queryTree() {
        int pid=0;
        List<TreeBean> list=findTree(pid);
        return list;
    }

    @Override
    public List<FoodBean> queryList(FoodBean food) {
        return foodDao2.queryList(food);
    }

    @Override
    public void addfood(FoodBean food) {
        if (food.getId()==null){
            foodDao2.addfood(food);
        }
        else{
            foodDao2.updatefood(food);
        }
    }

    @Override
    public FoodBean findById(int id) {
        return foodDao2.findById(id);
    }

    @Override
    public void del(String id) {
        String[] split = id.split(",");
        for (String i:
                split) {
            foodDao2.del(i);
        }
    }

    private List<TreeBean> findTree(int pid) {
        List<TreeBean> list= foodDao2.queryTree(pid);
        for (TreeBean tree : list) {
            List<TreeBean> list2=findTree(tree.getId());
            if (list2 != null && list2.size()>0) {
                tree.setSelectable(false);
                tree.setNodes(list2);
            }else {
                tree.setSelectable(true);
            }
        }
        return list;
    }
}
