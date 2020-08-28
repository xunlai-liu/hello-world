package com.demo.rabbitmq.fanout.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author xunlailiu
 * @date 2020/08/28
 */

@Component
@RabbitListener(queues = "fanout.B")
public class FanoutRabbitRecieverB {
    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("FanoutReceiverB消费者收到消息  : " +testMessage.toString());
    }

}
