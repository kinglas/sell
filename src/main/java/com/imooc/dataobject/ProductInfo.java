package com.imooc.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.enums.ProductStatusEnums;
import com.imooc.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by kinglas on 2017/8/24.
 * 商品
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
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
    /*商品状态 0 正常  ， 1 下架*/
    private Integer productStatus = ProductStatusEnums.UP.getCode();
    /*商品类目编号*/
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnums getProductStatusEnums(){
        return EnumUtil.getByCode(productStatus,ProductStatusEnums.class);
    }

}
