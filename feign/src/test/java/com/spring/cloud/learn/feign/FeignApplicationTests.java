package com.spring.cloud.learn.feign;

import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FeignApplicationTests {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @Test
    public void test1() {

        for (int i = 0; i < 10; i++) {
            String name = "no[" + i + "]";

            String ret = schedualServiceHi.sayHiFromClientOne(name);

            log.info("返回数据：{}", ret);
        }

    }

}
