package com.jk.bean;

import lombok.Data;

/**
 * 描述
 *
 * @author ghh
 * @date 2021/05/12 19:54:38
 */
@Data
public class FoodBean {
    private Integer id;
    private String fname;
    private Double fprice;
    private Integer ftype;
    private String fdate;
    private Integer fstate;

    private String startTime;
    private String endTime;


}
