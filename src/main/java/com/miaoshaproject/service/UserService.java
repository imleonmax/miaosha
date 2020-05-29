package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

/**
 * @Description :
 * @Author : LiuXinyu
 * @Date: 2020-05-26 13:32
 */
public interface UserService {
    //通过用户ID获取对象的方法
    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;
    /*
    telphone是用户注册手机
    password是用户加密密码
     */
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}
