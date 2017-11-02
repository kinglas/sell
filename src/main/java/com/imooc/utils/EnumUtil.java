package com.imooc.utils;

import com.imooc.enums.CodeEnum;
import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * Created by kinglas on 2017/10/20.
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
        for (T each: enumClass.getEnumConstants()){
            if(code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
