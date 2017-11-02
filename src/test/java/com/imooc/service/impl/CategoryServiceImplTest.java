package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kinglas on 2017/8/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl service;
    @Test
    public void findOne() throws Exception {
        ProductCategory pro = service.findOne(1);
        Assert.assertEquals(new Integer(1),pro.getCategoryId());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> list = service.findAll();
        Assert.assertNotEquals(null,list);
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> list = service.findByCategoryTypeIn(Arrays.asList(1,2,3,4));
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory("男生专享",10);
        ProductCategory result = service.save(productCategory);
        Assert.assertNotNull(result);
    }

}