package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.enums.ProductStatusEnums;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by kinglas on 2017/8/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    ProductServiceImpl service;
    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = service.findOne("111sds");
        Assert.assertEquals("111sds",productInfo.getProductId());
    }

    @Test
    public void findUpAll() throws Exception {
       List<ProductInfo> list =  service.findUpAll();
       Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findAll() throws Exception {
        //PageRequest继承自AbstractPageRequest类，而AbstractPageRequest又实现了Pageable接口
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfoPage = service.findAll(request);
        //System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("111sdw");
        productInfo.setCategoryType(2);
        productInfo.setProductName("西瓜瓜");
        productInfo.setProductDescription("很好吃的西瓜哦哦");
        productInfo.setProductStatus(ProductStatusEnums.DOWN.getCode());
        productInfo.setProductPrice(new BigDecimal(23.4));
        productInfo.setProductStock(222222);
        ProductInfo result = service.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void onSale(){
        ProductInfo productInfo = service.onSale("111sdw");

    }
    @Test
    public void offSale(){
        ProductInfo productInfo = service.offSale("111sdw");

    }
}