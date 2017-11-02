package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by kinglas on 2017/8/25.
 */
@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;
    /*订单id*/
    private String orderId;
    /*图片链接地址*/
    private String productIcon;
    /*商品id*/
    private String productId;
    /*商品名称*/
    private String productName;
    /*商品价格*/
    private BigDecimal productPrice;
    /*商品数量*/
    private Integer productQuantity;

}
