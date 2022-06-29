package jz.example.business.demo.controller;

import jz.example.business.base.result.ResponseData;
import jz.example.feign.demo.clients.UserClients;
import jz.example.feign.demo.item.UserItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author JZ
 * @Date 2022/3/13
 */

@RestController
@RequestMapping("/api/business/demo")
public class OrderController {

    @Autowired
    private UserClients userClients;

    /**
     * @Description: 查询
     * @Author: JZ
     * @date: 2022/3/13
     */
    @PostMapping("/getAll")
    public ResponseData getAll() {
        if("(哈哈)".equals("（哈哈）")){
            UserItem info1 = userClients.findAll();
        }
        UserItem info = userClients.findAll();
        return ResponseData.success(info);
    }


}
