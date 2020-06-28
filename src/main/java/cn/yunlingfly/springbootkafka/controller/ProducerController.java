package cn.yunlingfly.springbootkafka.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * 生产者
 *
 * @author yunlingfly
 * @version 1.0
 * @date 2020-6-28
 */
@RestController
public class ProducerController {

    @Resource
    private KafkaTemplate<String, Object> kafkaTemplate;

    @RequestMapping("/send")
    public String send() {
        kafkaTemplate.send("test", UUID.randomUUID().toString());
        // 分组测试
//        kafkaTemplate.send("test2", UUID.randomUUID().toString());
        return "aa";
    }

}
