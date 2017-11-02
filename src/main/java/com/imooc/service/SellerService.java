package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * Created by kinglas on 2017/10/27.
 */
public interface SellerService {
    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
