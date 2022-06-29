package jz.example.feign.demo.clients;

import jz.example.feign.demo.item.UserItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author JZ
 * @Date 2022/3/14
 */
@FeignClient("userserver")
public interface UserClients {

    @PostMapping("/api/user/getAll")
    UserItem findAll();

}
