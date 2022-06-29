package jz.example.business;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author JZ
 * @Date 2022/3/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MqTestController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    //简单队列
    @Test
    public void testSimpleQueue(){
        System.out.println("发送队列啦");
        String queueName = "demo-zzl";
        String message = "hello,world!";
        rabbitTemplate.convertAndSend(queueName,message);
    }

    //工作队列
    @Test
    public void testWorkQueue(){
        System.out.println("发送队列啦");
        String queueName = "demo-work-zzl";
        String message = "hello,world!";
        for(int i = 0 ;i <=50;i++){
            rabbitTemplate.convertAndSend(queueName,message + i);
        }
    }

    //广播
    @Test
    public void fanoutExchange(){
        System.out.println("发送队列啦");
        String exchange = "zzl.fanout";
        String message = "hello,world!~fanout";
        rabbitTemplate.convertAndSend(exchange,"",message);
    }

    //路由
    @Test
    public void directExchange(){
        System.out.println("发送队列啦");
        String exchange = "zzl.direct";
        String message = "hello,world!~direct";
        rabbitTemplate.convertAndSend(exchange,"red",message);
    }
}
