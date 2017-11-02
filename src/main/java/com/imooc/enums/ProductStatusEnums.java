package com.imooc.enums;

import lombok.Getter;

/**
 * Created by kinglas on 2017/8/24.
 * 商品状态
 */
/*lombok提供的方法，自动生成get 方法*/
@Getter
public enum ProductStatusEnums implements CodeEnum{
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;
    private String msg;

    ProductStatusEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
