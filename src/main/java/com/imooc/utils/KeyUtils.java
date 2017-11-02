package com.imooc.utils;

import java.util.Random;

/**
 * Created by kinglas on 2017/8/25.
 */
public class KeyUtils {
    /**
     * 生成唯一主键
     * 格式：时间 + 随机数
     * synchronized 这里关键字是为了使得每次生成的订单号（主键）唯一
     * @return
     */
    public static synchronized String getUniqueKey(){
        Random random = new Random();
        Integer number = random.nextInt(900000)+100000;
        return  System.currentTimeMillis() + String.valueOf(number);
    }
}
