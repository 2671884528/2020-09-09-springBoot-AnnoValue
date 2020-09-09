package com.springboot.war1.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther 郭永钢
 * @data 2020/9/9 14:13
 * @desc: 注意SpringBoot1.5之后取消了ConfigurationProperties（）注解的locations属性
 * 所得的替代方案是PropertySource指明路径
 */
@Data
@ConfigurationProperties(prefix = "book")
@PropertySource(value = "book.properties")
@Component
public class Book2 {

    String name;
    String author;


}
