package com.generator.code.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @Description: FsUser实体类
 * --------------------------------------
 * @ClassName: FsUser.java
 * @Date: 2021/03/24 23:50:20
 * @SoftWare: IntelliJ IDEA
 * --------------------------------------
 * @Author: lixj
 * @Contact: lixj_zj@163.com
 */

@Data
@TableName("fs_user")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "FsUser对象", description = "FsUser对象")
public class FsUser implements Serializable{

private static final long serialVersionUID=1L;

        @ApiModelProperty(value = "自增id")
        @TableId(value = "id", type = IdType.AUTO)
                private Long id;

        @ApiModelProperty(value = "手机号")
    @TableField("mobile")
            private String mobile;

        @ApiModelProperty(value = "昵称")
    @TableField("nickname")
            private String nickname;

        @ApiModelProperty(value = "MD5(MD5(pass明文+固定salt)+salt)")
    @TableField("password")
            private String password;

    @TableField("salt")
            private String salt;

        @ApiModelProperty(value = "头像，云储存ID")
    @TableField("head")
            private String head;

        @ApiModelProperty(value = "注册时间")
    @TableField("register_date")
            private LocalDateTime registerDate;

        @ApiModelProperty(value = "上次登录时间")
    @TableField("last_login_date")
            private LocalDateTime lastLoginDate;

        @ApiModelProperty(value = "登录次数")
    @TableField("login_count")
            private Integer loginCount;

        @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
            private LocalDateTime createTime;

        @ApiModelProperty(value = "修改时间")
    @TableField("modify_time")
            private LocalDateTime modifyTime;

        @ApiModelProperty(value = "备用字段")
    @TableField("note")
            private String note;


    public static final String ID ="id";

    public static final String MOBILE ="mobile";

    public static final String NICKNAME ="nickname";

    public static final String PASSWORD ="password";

    public static final String SALT ="salt";

    public static final String HEAD ="head";

    public static final String REGISTER_DATE ="register_date";

    public static final String LAST_LOGIN_DATE ="last_login_date";

    public static final String LOGIN_COUNT ="login_count";

    public static final String CREATE_TIME ="create_time";

    public static final String MODIFY_TIME ="modify_time";

    public static final String NOTE ="note";

        }