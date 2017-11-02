package com.imooc.dto;

import lombok.Data;

/**
 * Created by kinglas on 2017/8/28.
 * 购物车
 */
@Data
public class CartDTO {
    /*商品id*/
    private String productID;
    /*数量*/
    private Integer productQuantity;

    public CartDTO(String productID, Integer productQuantity) {
        this.productID = productID;
        this.productQuantity = productQuantity;
    }
}
