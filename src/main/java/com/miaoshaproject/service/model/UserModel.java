package com.miaoshaproject.service.model;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Description :
 * @Author : LiuXinyu
 * @Date: 2020-05-26 13:50
 */
@Data
public class UserModel implements Serializable {
    private static final long serialVersionUID = -3912823064679683828L;
    private Integer id;

    @NotBlank(message = "姓名不能为空")
    private String name;

    @NotNull(message = "姓名不能为空")
    private Byte gender;

    @NotNull(message = "年龄不能为空")
    @Min(value = 0,message = "年龄不能小于0")
    @Max(value = 150,message = "年龄不能大于150")
    private Integer age;

    @NotBlank(message = "手机号不能为空")
    private String telphone;

    private String registerMode;
    private String thirdPartyId;

    @NotBlank(message = "密码不能为空")
    private String encrptPassword;
}
