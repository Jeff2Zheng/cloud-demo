package jz.example.user.jzplatform.config.controller;

import jz.example.user.base.result.ResponseData;
import jz.example.user.jzplatform.config.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: configController
 * @Author: JZ
 * @date: 2022/9/6
 */
@RestController
@RequestMapping("/api/config")
public class ConfigController {

    @Autowired
    private ConfigService configService;

    /**
    /**
    * 查找详情
    * @return
    */
    @RequestMapping(value = "/getInfo", method = { RequestMethod.POST})
    public ResponseData getConfigInfo() {
        return  ResponseData.success(configService.getConfigInfo());
    }
}

