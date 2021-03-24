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
 * @Description: FsGoods实体类
 * --------------------------------------
 * @ClassName: FsGoods.java
 * @Date: 2021/03/24 23:50:20
 * @SoftWare: IntelliJ IDEA
 * --------------------------------------
 * @Author: lixj
 * @Contact: lixj_zj@163.com
 */

@Data
@TableName("fs_goods")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "FsGoods对象", description = "FsGoods对象")
public class FsGoods implements Serializable{

private static final long serialVersionUID=1L;

        @ApiModelProperty(value = "自增id")
        @TableId(value = "id", type = IdType.AUTO)
                private Long id;

        @ApiModelProperty(value = "商品id")
    @TableField("goods_id")
            private Long goodsId;

        @ApiModelProperty(value = "秒杀价格")
    @TableField("miaosha_price")
            private BigDecimal miaoshaPrice;

        @ApiModelProperty(value = "秒杀价格")
    @TableField("stock_count")
            private Integer stockCount;

        @ApiModelProperty(value = "开始时间")
    @TableField("start_date")
            private LocalDateTime startDate;

        @ApiModelProperty(value = "截止时间")
    @TableField("end_date")
            private LocalDateTime endDate;

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

    public static final String GOODS_ID ="goods_id";

    public static final String MIAOSHA_PRICE ="miaosha_price";

    public static final String STOCK_COUNT ="stock_count";

    public static final String START_DATE ="start_date";

    public static final String END_DATE ="end_date";

    public static final String CREATE_TIME ="create_time";

    public static final String UPDATE_TIME ="update_time";

    public static final String NOTE ="note";

        }