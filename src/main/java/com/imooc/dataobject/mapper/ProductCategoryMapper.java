package com.imooc.dataobject.mapper;

import com.imooc.dataobject.ProductCategory;
import org.apache.ibatis.annotations.Insert;

import java.util.Map;

/**
 * Created by kinglas on 2017/11/2.
 */
public interface ProductCategoryMapper {
    @Insert("insert into product_category(category_name,category_type) values (#{category_name,jdbcType = VARCHAR},#{category_type,jdbcType = INTEGER})")
    int insertByMap(Map<String,Object> map);


    ProductCategory findByCategoryType(Integer categoryType);
}


