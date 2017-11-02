package com.imooc.config;

import lombok.Data;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.net.ssl.SSLContext;

/**
 * Created by kinglas on 2017/8/30.
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    /*公众平台id*/
    private String mpAppId;

    /*公众平台秘钥*/
    private String mpAppSecret;

    /*开放平台id*/
    private String openAppId;

    /*开放平台秘钥*/
    private String openAppSecret;

    /**
     * 商户号
     */
    private String mchId;

    /**
     * 商户秘钥
     */
    private String mchKey;

    /**
     * 商户证书路径
     */
    private String keyPath;

    /*微信支付异步通知地址*/
    private String notifyUrl;

}
