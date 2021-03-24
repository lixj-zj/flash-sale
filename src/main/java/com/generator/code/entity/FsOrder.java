package com.generator.code.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @Description: FsOrder实体类
 * --------------------------------------
 * @ClassName: FsOrder.java
 * @Date: 2021/03/24 23:50:20
 * @SoftWare: IntelliJ IDEA
 * --------------------------------------
 * @Author: lixj
 * @Contact: lixj_zj@163.com
 */

@Data
@TableName("fs_order")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "FsOrder对象", description = "FsOrder对象")
public class FsOrder implements Serializable{

private static final long serialVersionUID=1L;

        @ApiModelProperty(value = "自增id")
        @TableId(value = "id", type = IdType.AUTO)
                private Long id;

        @ApiModelProperty(value = "用户id")
    @TableField("user_id")
            private Long userId;

        @ApiModelProperty(value = "订单id")
    @TableField("order_id")
            private Long orderId;

        @ApiModelProperty(value = "商品id")
    @TableField("goods_id")
            private Long goodsId;


    public static final String ID ="id";

    public static final String USER_ID ="user_id";

    public static final String ORDER_ID ="order_id";

    public static final String GOODS_ID ="goods_id";

        }