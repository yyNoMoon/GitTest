package com.example.demo.controller;

import com.example.demo.dao.entity.LearnConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author gaoyue
 * @date 2021/10/18 18:13
 */
@RestController
@EnableConfigurationProperties(LearnConfig.class)
public class HelloController {

    private static final String msg = "welcome to my computer";

    @RequestMapping("/hello")
    public String index(){
        return "第一次创建SpringBoot项目用于学习";
    }

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private int age;

    @RequestMapping("/pr")
    public String printMe(){
        pppp();
        return name+": "+age;
    }

    private void pppp(){
        List<String> l = new ArrayList<>();

        l.add("hello");
        l.add("world");
        l.add("!");

        String[] ls = new String[]{"hello", "world", "!"};

        System.out.println(String.join(" ", l));
    }

    @Autowired
    private LearnConfig learnConfig;

    @RequestMapping("/getProEntity")
    public String printProperties() {
        return learnConfig.getIntroduction()+"-"+learnConfig.getName()+"-"+learnConfig.getAge()+
                "-"+learnConfig.getUuid()+"-"+learnConfig.getValue();
    }

    public void test(){
        // 注释
        System.out.println("测试推送到远程仓库");
    }

}
