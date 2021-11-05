package com.example.demo;


import com.example.demo.dao.entity.LearnConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerT {
    @LocalServerPort
    private int port;
    private URL base;
    @Autowired
    private TestRestTemplate template;
    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:"+port+"/getProEntity");
    }

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);
        assert response.getBody().equals("第一次创建SpringBoot项目用于学习");
    }

    @Autowired
    private LearnConfig learnConfig;

    @Test
    public void testGetProps() throws Exception {
        this.base = new URL("http://localhost:"+port+"/getProEntity");
        ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);

        String realStr = learnConfig.getIntroduction()+"-"+learnConfig.getName()+"-"+learnConfig.getAge()+
                "-"+learnConfig.getUuid()+"-"+learnConfig.getValue();
        assert response.getBody().equals(realStr);
    }
}
