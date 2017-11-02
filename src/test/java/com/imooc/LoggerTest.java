package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by kinglas on 2017/8/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//在使用所有注释前必须使用@RunWith(SpringRunner.class),让测试运行于Spring测试环境
@Slf4j
//@Slf4j 注解与lomck插件的配合使用使得我们不用再在类里面引入logger，直接写log.info()就行
public class LoggerTest {
//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test1(){
        String name = "imooc";
        String password = "123456";
        log.debug("debug....");
        //输出格式是这样的 name:imooc, password:123456
        log.info("name:{}, password:{}", name, password);
    }
}
