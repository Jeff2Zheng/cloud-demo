package jz.example.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author JZ
 * @Date 2022/3/13
 */
// @EnableJpaAuditing //jpa来自动填充
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "jz.example.feign")
@MapperScan({"jz.example.user.*.mapper","jz.example.user.jzplatform.*.mapper"})
    public class UserApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserApplication.class,args);

    }

}
