package com.imooc.service;

import com.imooc.dataobject.OrderMaster;
import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by kinglas on 2017/8/25.
 */
public interface OrderService {
    /*创建订单*/
    OrderDTO creat(OrderDTO orderDTO);

    /*查询单个订单*/
    OrderDTO findOne(String orderId);

    /*查询订单列表*/
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /*取消订单*/
    OrderDTO cancle(OrderDTO orderDTO);

    /*完结订单*/
    OrderDTO finsh(OrderDTO orderDTO);

    /*支付订单*/
    OrderDTO paid(OrderDTO orderDTO);

    /*查询订单列表，卖家端*/
    Page<OrderDTO> findList(Pageable pageable);

}
