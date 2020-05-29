package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

/**
 * @Description :
 * @Author : LiuXinyu
 * @Date: 2020-05-28 13:08
 */
public interface PromoService {
    PromoModel getPromoByItemId(Integer itemId);
}
