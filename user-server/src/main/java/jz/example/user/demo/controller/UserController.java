package jz.example.user.demo.controller;

import jz.example.user.base.result.ResponseData;
import jz.example.user.demo.item.InfoQueryPageItem;
import jz.example.user.demo.item.UserAndCompanyPageItem;
import jz.example.user.demo.pojo.User;
import jz.example.user.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author JZ
 * @Date 2022/3/13
 */

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService UserService;

    @PostMapping("/getAll")
    public User getById() {
        return UserService.getById();
    }


    /**
     * @Description: 新增
     * @Author: JZ
     * @date: 2022/4/3
     */
    @PostMapping("/save")
    public void saveUser() {
        UserService.save();
    }

    /**
     * @Description: wrapperQuery查询
     * @Author: JZ
     * @date: 2022/4/3
     */
    @PostMapping("/wrapperQuery")
    public void wrapperQuery() {
        UserService.wrapperQuery();
    }

    /**
     * @Description: 自定义分页查询
     * @Author: JZ
     * @date: 2022/4/3
     */
    @PostMapping("/page")
    public ResponseData page(@RequestBody InfoQueryPageItem pageItem) {
        return UserService.page(pageItem);
    }

    /**
     * @Description: 自定义多表分页查询
     * @Author: JZ
     * @date: 2022/4/3
     */
    @PostMapping("/page2")
    public ResponseData page2(@RequestBody UserAndCompanyPageItem item) {
        return UserService.page2(item);
    }

}
