package com.imooc.dao;

import com.imooc.dataobject.ProductCategory;
import org.apache.ibatis.annotations.Insert;

import java.util.Map;

/**
 * Created by kinglas on 2017/11/1.
 */
public interface CategoryDao {
//    ProductCategory findByCategoryType(Integer type);
    ProductCategory findByCategoryType(Integer categoryType);

    @Insert("insert into product_category(category_name,category_type) values (#{category_name,jdbcType = VARCHAR},#{category_type,jdbcType = INTEGER})")
    int insertByMap(Map<String,Object> map);
}
