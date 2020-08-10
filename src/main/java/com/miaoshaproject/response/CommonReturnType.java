package com.miaoshaproject.response;

import lombok.Data;

/**
 * @Description :
 * @Author : LiuXinyu
 */
@Data
public class CommonReturnType {
    //有success和fail
    private String status;
    //若status=success，data返回前端需要的JSON数据
    //若fail，则data内使用通用的错误码格式
    private Object data;

    public static CommonReturnType create(Object result) {
        return CommonReturnType.create(result, "success");
    }

    //定义一个通用的创建方法
    public static CommonReturnType create(Object result, String status) {
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return type;
    }
}
