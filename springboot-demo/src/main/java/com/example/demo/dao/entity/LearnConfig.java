package com.example.demo.dao.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**  
 * @projectName springboot-demo
 * @packageName com.example.demo.dao.entity
 * @description: TODO
 * @author gaoyue
 * @date 2021/10/18 18:13
 */
@ConfigurationProperties(prefix = "my")
@Component
public class LearnConfig {

    private String name;
    private Integer age;
    private String uuid;
    private String value;
    private String introduction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
