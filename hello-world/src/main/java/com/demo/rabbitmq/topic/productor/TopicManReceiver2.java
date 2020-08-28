package com.demo.rabbitmq.topic.productor;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author xunlailiu
 * @date 2020/08/28
 */
@Component
@RabbitListener(queues = "topic.man")
public class TopicManReceiver2 {


    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("TopicManReceiver2消费者收到消息  : " + testMessage.toString());
    }

}
