package jz.example.user.business.juc.controller;

import jz.example.user.base.result.ResponseData;
import jz.example.user.business.juc.item.JucQueryPageItem;
import jz.example.user.business.juc.service.JucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: JUC
 * @Author: JZ
 * @date: 2022/11/6
 */
@RestController
@RequestMapping("/api/juc")
public class JucController {

    @Autowired
    private JucService jucService;

    /**
     * @Description:
     * @Author: JZ
     * @date: 2022/10/26
     */
    @PostMapping("/page")
    public ResponseData page(@RequestBody JucQueryPageItem pageItem) {
        return jucService.page(pageItem);
    }

}
