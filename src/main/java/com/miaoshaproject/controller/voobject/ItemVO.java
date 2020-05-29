package com.miaoshaproject.controller.voobject;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description :
 * @Author : LiuXinyu
 * @Date: 2020-05-27 21:44
 */
@Data
public class ItemVO {

    private Integer id;

    private String title;

    private BigDecimal price;

    private Integer stock;

    private String description;

    private Integer sales;

    private String imgUrl;

    //记录商品是否在秒杀活动中，以及对应的status = 0 没有秒杀活动，为1 待抢购，为2 进行中
    private Integer promoStatus;

    //秒杀活动价格
    private BigDecimal promoPrice;
    //秒杀活动ID
    private Integer promoId;

    private String startDate;
}
