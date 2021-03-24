package com.generator.code.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @Description: OrderInfo实体类
 * --------------------------------------
 * @ClassName: OrderInfo.java
 * @Date: 2021/03/24 23:50:20
 * @SoftWare: IntelliJ IDEA
 * --------------------------------------
 * @Author: lixj
 * @Contact: lixj_zj@163.com
 */

@Data
@TableName("order_info")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "OrderInfo对象", description = "OrderInfo对象")
public class OrderInfo implements Serializable{

private static final long serialVersionUID=1L;

        @ApiModelProperty(value = "自增id")
        @TableId(value = "id", type = IdType.AUTO)
                private Long id;

        @ApiModelProperty(value = "用户id")
    @TableField("user_id")
            private Long userId;

        @ApiModelProperty(value = "商品id")
    @TableField("goods_id")
            private Long goodsId;

        @ApiModelProperty(value = "收货地址")
    @TableField("delivery_addr_id")
            private Long deliveryAddrId;

        @ApiModelProperty(value = "冗余过来的商品名称")
    @TableField("goods_name")
            private String goodsName;

        @ApiModelProperty(value = "商品数量")
    @TableField("goods_count")
            private Integer goodsCount;

        @ApiModelProperty(value = "商品价格")
    @TableField("goods_price")
            private BigDecimal goodsPrice;

        @ApiModelProperty(value = "订单渠道。1pc,2android,3ios")
    @TableField("order_channel")
            private Integer orderChannel;

        @ApiModelProperty(value = "订单状态。0新建未支付，1已支付，2已发货，3已收货，4已退款，5已完成")
    @TableField("status")
            @TableLogic
    private Integer status;

        @ApiModelProperty(value = "创建日期")
    @TableField("create_date")
            private LocalDateTime createDate;

        @ApiModelProperty(value = "付款日期")
    @TableField("pay_date")
            private LocalDateTime payDate;

        @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
            private LocalDateTime createTime;

        @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
            private LocalDateTime updateTime;

        @ApiModelProperty(value = "备注")
    @TableField("note")
            private String note;


    public static final String ID ="id";

    public static final String USER_ID ="user_id";

    public static final String GOODS_ID ="goods_id";

    public static final String DELIVERY_ADDR_ID ="delivery_addr_id";

    public static final String GOODS_NAME ="goods_name";

    public static final String GOODS_COUNT ="goods_count";

    public static final String GOODS_PRICE ="goods_price";

    public static final String ORDER_CHANNEL ="order_channel";

    public static final String STATUS ="status";

    public static final String CREATE_DATE ="create_date";

    public static final String PAY_DATE ="pay_date";

    public static final String CREATE_TIME ="create_time";

    public static final String UPDATE_TIME ="update_time";

    public static final String NOTE ="note";

        }