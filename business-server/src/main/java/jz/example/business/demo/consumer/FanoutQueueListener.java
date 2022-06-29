package jz.example.business.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author JZ
 * @Date 2022/3/16
 */
@Component
public class FanoutQueueListener {

    /**
     * 广播队列模型 》 声明交换机 由交换机发送给全部队列。为之称为广播模式
     * 广播模式是producer > exchange > 多个队列
     * @Author: JZ
     * @date: 2022/3/16
     */
    @RabbitListener(queues ="fanout-demo-1")
    public void workQueueMsg1(String msg) {
        System.out.println("11111111------------收到的消息为：" + msg );
    }

    @RabbitListener(queues ="fanout-demo-2")
    public void workQueueMsg12(String msg) {
        System.out.println("222222222-----------收到的消息为：" + msg );
    }




}
