package com.spring.cloud.learn.ribbon;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RibbonApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void test1() {

        for (int i = 0; i < 10; i++) {
            String name = "no" + i;
            String msg = restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
            log.info("服务器返回:{}", msg);
        }

    }

}
