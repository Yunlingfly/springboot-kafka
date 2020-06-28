package cn.yunlingfly.springbootkafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 *
 * @author yunlingfly
 * @version 1.0
 * @date 2020-6-28
 */
@Component
public class MyConsumer {

    @KafkaListener(topics = "test", groupId = "group1")
    public void listen(ConsumerRecord<?, String> record) {
        String value = record.value();
        System.out.println("kafka监听的值是1：" + value);
        System.out.println(record);
    }

//    @KafkaListener(topics = "test2", groupId = "group2")
//    public void listen2(ConsumerRecord<?,String> record) {
//        String value = record.value();
//        System.out.println("kafka监听的值是2："+value);
//        System.out.println(record);
//    }
//
//    @KafkaListener(topics = "test2", groupId = "group2")
//    public void listen3(ConsumerRecord<?,String> record) {
//        String value = record.value();
//        System.out.println("kafka监听的值是3："+value);
//        System.out.println(record);
//    }

}