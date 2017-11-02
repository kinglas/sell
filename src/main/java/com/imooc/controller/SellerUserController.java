package com.imooc.controller;

import com.imooc.config.ProjectUrlConfig;
import com.imooc.constant.CookieConstant;
import com.imooc.constant.RedisContant;
import com.imooc.dataobject.SellerInfo;
import com.imooc.enums.ResultEnum;
import com.imooc.service.SellerService;
import com.imooc.utils.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by kinglas on 2017/10/30.
 */
@Controller
@RequestMapping("/seller")
public class SellerUserController {

    @Autowired
    SellerService sellerService;
    @Autowired
    StringRedisTemplate redisTemplate;
    @Autowired
    ProjectUrlConfig urlConfig;

    @GetMapping("/login")
    public ModelAndView login(@RequestParam("openid")String openid,
                              Map<String,Object> map,
                              HttpServletResponse response){
         //1.openid去和数据库里的数据匹配
        SellerInfo sellerInfo = sellerService.findSellerInfoByOpenid(openid);
        if (sellerInfo == null){
            map.put("msg", ResultEnum.LOGIN_FAIL.getMsg());
            map.put("url","/sell/seller/order/list");
            return new ModelAndView("common/error",map);
        }

         //2.设置token至redis
        String token = UUID.randomUUID().toString();
        /*设置过期时间*/
        Integer expire = RedisContant.EXPIRE;
        redisTemplate.opsForValue().set(String.format(RedisContant.TOKEN_PREFIX,token),openid,expire, TimeUnit.SECONDS);

         //3.设置token至cookie
        CookieUtil.set(response,CookieConstant.TOKEN,token,expire);
        return new ModelAndView("redirect:" + urlConfig.getSell() +"/sell/seller/order/list");

     }

    @GetMapping("/logout")
    public ModelAndView logout(HttpServletRequest request,
                               HttpServletResponse response
                               ){
        //1.获取cookie
        Cookie cookie = CookieUtil.get(request,CookieConstant.TOKEN);
        if (cookie != null){
            //2.清除redis
            redisTemplate.opsForValue().getOperations().delete(CookieConstant.TOKEN);
            //3.清除cookie
            CookieUtil.set(response,CookieConstant.TOKEN,null,0);
        }
        Map<String ,Object> map = new HashMap<>();
        map.put("msg",ResultEnum.LOGOUT_SUCCESS.getMsg());
        map.put("url","/sell/seller/order/list");
        return new ModelAndView("common/success",map);

    }
}
