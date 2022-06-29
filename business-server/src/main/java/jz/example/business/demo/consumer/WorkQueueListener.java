package jz.example.business.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author JZ
 * @Date 2022/3/16
 */
@Component
public class WorkQueueListener {

    /**
     * 工作队列模型 》 负载均衡原理  消费者多个   提高消息处理速度，避免堆积
     * producer 》 队列 》多个消费者
     * 一：@Configuration +　@bean 注册bean 防止启动队列无法找到
     * 二：发送队列 rabbitTemplate.convertAndSend
     * 三：接收队列
     * 四：确认key保持一致
     * 五：默认是channel>消息预取模式，通过配置yml处理
     * @Author: JZ
     * @date: 2022/3/16
     */
    @RabbitListener(queues ="demo-work-zzl")
    public void workQueueMsg1(String msg) throws InterruptedException {
        System.out.println("11111111------------收到的消息为：" + msg );
        Thread.sleep(20);
    }

    @RabbitListener(queues ="demo-work-zzl")
    public void workQueueMsg12(String msg) throws InterruptedException {
        System.out.println("222222222-----------收到的消息为：" + msg );
        Thread.sleep(200);
    }

}
