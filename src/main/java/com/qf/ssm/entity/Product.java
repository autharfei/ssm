package com.qf.ssm.entity;

import lombok.Data;

import java.io.Serializable;
@Data

public class Product implements Serializable {
    /**
     * 产品id
     */
    private Integer productId;

    /**
     * 产品名字
     */
    private String productName;

    /**
     * 状态值默认为0,1为删除
     */
    private Boolean status;

    private static final long serialVersionUID = 1L;

}

