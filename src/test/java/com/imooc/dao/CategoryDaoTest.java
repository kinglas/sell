package com.imooc.dao;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by kinglas on 2017/11/1.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CategoryDaoTest {

    @Autowired
    CategoryDao categoryDao;
    @Test
    public void findByCategoryType() throws Exception {
        ProductCategory category = categoryDao.findByCategoryType(1);
        Assert.assertNotNull(category);
    }

    @Test
    public void insertByMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("category_name","超市特供");
        map.put("category_type",8);
        categoryDao.insertByMap(map);
    }

}