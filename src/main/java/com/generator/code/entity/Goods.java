package com.generator.code.entity;

import java.math.BigDecimal;
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
 * @Description: Goods实体类
 * --------------------------------------
 * @ClassName: Goods.java
 * @Date: 2021/03/24 23:50:20
 * @SoftWare: IntelliJ IDEA
 * --------------------------------------
 * @Author: lixj
 * @Contact: lixj_zj@163.com
 */

@Data
@TableName("goods")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "Goods对象", description = "Goods对象")
public class Goods implements Serializable{

private static final long serialVersionUID=1L;

        @ApiModelProperty(value = "自增id")
        @TableId(value = "id", type = IdType.AUTO)
                private Long id;

        @ApiModelProperty(value = "商品名称")
    @TableField("goods_name")
            private String goodsName;

        @ApiModelProperty(value = "商品标题")
    @TableField("goods_title")
            private String goodsTitle;

        @ApiModelProperty(value = "商品图片")
    @TableField("goods_img")
            private String goodsImg;

        @ApiModelProperty(value = "商品详情")
    @TableField("goods_detail")
            private String goodsDetail;

        @ApiModelProperty(value = "商品单价")
    @TableField("goods_price")
            private BigDecimal goodsPrice;

        @ApiModelProperty(value = "商品库存。-1表示没有限制")
    @TableField("goods_stock")
            private Integer goodsStock;

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

    public static final String GOODS_NAME ="goods_name";

    public static final String GOODS_TITLE ="goods_title";

    public static final String GOODS_IMG ="goods_img";

    public static final String GOODS_DETAIL ="goods_detail";

    public static final String GOODS_PRICE ="goods_price";

    public static final String GOODS_STOCK ="goods_stock";

    public static final String CREATE_TIME ="create_time";

    public static final String UPDATE_TIME ="update_time";

    public static final String NOTE ="note";

        }