package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by kinglas on 2017/8/24.
 * 商品（包含类目）
 */
@Data
public class ProductVO {
    //@JsonProperty("name")表示，把categoryName的值通过"name"返还给页面
    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
