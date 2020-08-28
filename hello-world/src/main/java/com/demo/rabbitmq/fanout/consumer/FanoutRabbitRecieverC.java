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
@RabbitListener(queues = "fanout.C")
public class FanoutRabbitRecieverC {
    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("FanoutReceiverC消费者收到消息  : " +testMessage.toString());
    }

}
