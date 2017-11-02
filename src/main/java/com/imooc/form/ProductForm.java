package com.imooc.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by kinglas on 2017/10/26.
 */
@Data
public class ProductForm {
    private String productId;
    /*商品名称*/
    private String productName;
    /*单价*/
    private BigDecimal productPrice;
    /*库存*/
    private Integer productStock;
    /*商品描述*/
    private String productDescription;
    /*商品小图链接*/
    private String productIcon;
//    /*商品状态 0 正常  ， 1 下架*/
//    private Integer productStatus;
    /*商品类目编号*/
    private Integer categoryType;
}
