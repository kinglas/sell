package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by kinglas on 2017/8/25.
 * 买家订单
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    /**订单id*/
    @Id
    private String orderId;
    /*买家姓名*/
    private String buyerName;
    /*买家手机号*/
    private String buyerPhone;
    /*买家地址*/
    private String buyerAddress;
    /*买家微信 Openid*/
    private String buyerOpenid;
    /*订单总金额*/
    private BigDecimal orderAmount;
    /**订单状态*/
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /*支付状态*/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();
    /*创建时间*/
    private Date createTime;
    /*更新时间*/
    private Date updateTime;

    //@Transient 改注解可以在数据库对应的时候忽略 orderDetailList 字段，但我们这里不这么用
//    @Transient
//    private List<OrderDetail> orderDetailList;
}
