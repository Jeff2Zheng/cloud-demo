package jz.example.user.business.menu.controller;

import jz.example.user.base.result.ResponseData;
import jz.example.user.business.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author JZ
 * @Date 2022/10/26
 */
@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    /**
     * @Description:
     * @Author: JZ
     * @date: 2022/10/26
     */
    @PostMapping("/get")
    public ResponseData get() {
        return ResponseData.success(menuService.get());
    }

}
