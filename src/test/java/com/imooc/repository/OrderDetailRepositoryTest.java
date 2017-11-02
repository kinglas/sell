package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kinglas on 2017/8/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {
    @Autowired
    OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("2323442");
        orderDetail.setProductId("sfdsdfsd");
        orderDetail.setOrderId("sassdd");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(13.5));
        orderDetail.setProductIcon("http://dsfd.jpg");
        orderDetail.setProductQuantity(13);
        OrderDetail res = repository.save(orderDetail);
        Assert.assertNotNull(res);
    }

    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> orderDetailList = repository.findByOrderId("sasd");
        Assert.assertNotEquals(0,orderDetailList.size());

    }

}