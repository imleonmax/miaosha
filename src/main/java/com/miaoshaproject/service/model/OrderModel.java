package com.miaoshaproject.service.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description :
 * @Author : LiuXinyu
 * @Date: 2020-05-27 23:20
 */
//用户下单的交易模型
@Data
public class OrderModel {
    //企业级一般用String类型，而不是int
    private String id;

    private Integer userId;

    private Integer itemId;

    //若promoId非空，则是秒杀方式下单
    private Integer promoId;

    //若promoId非空，则是秒杀价格
    private BigDecimal itemPrice;

    private Integer amount;

    //若promoId非空，则是秒杀总价
    private BigDecimal orderPrice;
}
