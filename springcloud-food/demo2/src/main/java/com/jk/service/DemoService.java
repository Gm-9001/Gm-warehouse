package com.jk.service;

import com.jk.bean.TreeBean;
import com.jk.service.Impl.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 描述
 *
 * @author ghh
 * @date 2021/05/13 12:51:04
 */
@FeignClient(value = "provider",fallback = UserServiceHystrix.class)
public interface DemoService {
    @GetMapping("food/queryTree")
    List<TreeBean> test();
}
