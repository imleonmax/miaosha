package com.miaoshaproject.service.model;

import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description :
 * @Author : LiuXinyu
 * @Date: 2020-05-28 12:40
 */
@Data
public class PromoModel implements Serializable {
    private static final long serialVersionUID = 7918068595307003894L;
    private Integer id;

    //秒杀活动状态，1表示还未开始，2表示进行中，3表示已结束
    private Integer status;

    //秒杀活动名称
    private String promoName;

    //秒杀开始时间
    private DateTime startDate;

    private DateTime endDate;

    //秒杀活动适用商品
    private Integer itemId;

    //秒杀获得的商品价格
    private BigDecimal promoItemPrice;
}
