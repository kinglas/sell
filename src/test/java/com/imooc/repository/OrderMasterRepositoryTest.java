package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by kinglas on 2017/8/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    OrderMasterRepository repository;

    private final String OPENID = "asfdfs";

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("sasw");
        orderMaster.setBuyerName("大哥哥");
        orderMaster.setBuyerAddress("白宫");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setBuyerPhone("123434545");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        OrderMaster res = repository.save(orderMaster);
        Assert.assertNotNull(res);
    }
    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest pageRequest = new PageRequest(0,3);
        Page<OrderMaster> res = repository.findByBuyerOpenid(OPENID,pageRequest);
        System.out.println(res.getContent().size());
        Assert.assertNotNull(res.getTotalElements());
    }

}