package jz.example.business.demo.consumer;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author JZ
 * @Date 2022/3/16
 */
@Component
public class DirectQueueListener {

    /**
     * 路由队列模型 》
     * 广播模式是producer > exchange > 多个队列 （交换机到队列可指定路由）
     * @Author: JZ
     * @date: 2022/3/16
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "direct-queue-1"),exchange = @Exchange(name = "zzl.direct",type = ExchangeTypes.DIRECT),
            key = {"red","yellow"}
    ))
    public void workQueueMsg1(String msg) {
        System.out.println("11111111------------收到的消息为：" + msg );
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "direct-queue-2"),exchange = @Exchange(name = "zzl.direct"),
            key = {"red","black"}
    ))
    public void workQueueMsg12(String msg) {
        System.out.println("222222222-----------收到的消息为：" + msg );
    }


}
