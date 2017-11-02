package com.imooc.service;

import com.imooc.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;

/**
 * 支付
 * Created by kinglas on 2017/9/1.
 */
public interface PayService {
    PayResponse create(OrderDTO orderDTO);
}
