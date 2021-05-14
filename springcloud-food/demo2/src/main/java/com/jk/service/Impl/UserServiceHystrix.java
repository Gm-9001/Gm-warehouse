package com.jk.service.Impl;

import com.jk.bean.TreeBean;
import com.jk.service.DemoService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述
 *
 * @author ghh
 * @date 2021/05/13 12:51:47
 */
@Component
public class UserServiceHystrix implements DemoService {
    @Override
    public List<TreeBean> test() {
        System.out.println("error");
        List<TreeBean> list=new ArrayList<>();
        TreeBean treeBean=new TreeBean();
        treeBean.setId(404);
        treeBean.setText("未找到");
        treeBean.setNodes(null);
        treeBean.setPid(null);
        treeBean.setSelectable(null);
        treeBean.setUrl(null);
        list.add(treeBean);
        return list;
    }
}
