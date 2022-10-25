package jz.example.user.business.auth.controller;

import jz.example.user.base.result.ResponseData;
import jz.example.user.business.auth.item.LoginItem;
import jz.example.user.business.auth.service.AuthService;
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
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    /**
     * @Description:
     * @Author: JZ
     * @date: 2022/9/20
     */
    @PostMapping("/login")
    public ResponseData login(@RequestBody LoginItem loginItem) {
        return authService.login(loginItem);
    }

//
//    /**
//     * @Description: 新增
//     * @Author: 小小郑
//     * @date: 2022/4/3
//     */
//    @PostMapping("/save")
//    public void saveUser() {
//        UserService.save();
//    }
//
//    /**
//     * @Description: wrapperQuery查询
//     * @Author: JZ
//     * @date: 2022/4/3
//     */
//    @PostMapping("/wrapperQuery")
//    public void wrapperQuery() {
//        UserService.wrapperQuery();
//    }
//
//    /**
//     * @Description: 自定义分页查询
//     * @Author: JZ
//     * @date: 2022/4/3
//     */
//    @PostMapping("/page")
//    public ResponseData page(@RequestBody InfoQueryPageItem pageItem) {
//        return UserService.page(pageItem);
//    }
//
//    /**
//     * @Description: 自定义多表分页查询
//     * @Author: JZ
//     * @date: 2022/4/3
//     */
//    @PostMapping("/page2")
//    public ResponseData page2(@RequestBody UserAndCompanyPageItem item) {
//        return UserService.page2(item);
//    }

}
