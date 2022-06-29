package jz.example.business.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author JZ
 * @Date 2022/3/16
 */
@Component
public class SimpleQueueListener {

    /**
     * 简单队列模型
     * producer > 队列 》 消费者
     * 一：@Configuration +　@bean 注册bean 防止启动队列无法找到
     * 二：发送队列 rabbitTemplate.convertAndSend
     * 三：接收队列
     * 四：确认key保持一致。
     * @Author: JZ
     * @date: 2022/3/16
     */
    @RabbitListener(queues ="demo-zzl")
    public void simpleQueueMsg(String msg){
        System.out.println("收到的消息为：" + msg);
    }

}
