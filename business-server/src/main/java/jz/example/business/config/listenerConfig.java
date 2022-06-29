package jz.example.business.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author JZ
 * @Date 2022/3/16
 */
@Configuration
public class listenerConfig {

    //简单
    @Bean
    public Queue simpleCreateQueue(){
        return new Queue("demo-zzl");
    }
    //工作
    @Bean
    public Queue workCreateQueue(){
        return new Queue("demo-work-zzl");
    }
    //广播
    @Bean
    public Queue fanoutCreateQueue1(){
        return new Queue("fanout-demo-1");
    }
    @Bean
    public Queue fanoutCreateQueue2(){
        return new Queue("fanout-demo-2");
    }
    @Bean
    public FanoutExchange fanoutCreate(){
        return new FanoutExchange("zzl.fanout");
    }
    @Bean
    public Binding bindingQueue1(Queue fanoutCreateQueue1,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(fanoutCreateQueue1).to(fanoutExchange);
    }
    @Bean
    public Binding bindingQueue2(Queue fanoutCreateQueue2,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(fanoutCreateQueue2).to(fanoutExchange);
    }

}
