package jz.example.user.es.controller;

import jz.example.user.base.result.ResponseData;
import jz.example.user.es.service.EsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @Author JZ
 * @Date 2022/3/30
 */
@RestController
@RequestMapping("/api/user/es")
public class EsController {

    @Autowired
    private EsService esService;

    @PostMapping("/createSuoYin")
    public ResponseData createSuoYin() throws IOException {
        return esService.createSuoYin();
    }

    @PostMapping("/deleteSuoYinKu")
    public ResponseData deleteSuoYinKu() throws IOException {
        return esService.deleteSuoYinKu();
    }

    @PostMapping("/addWenDang")
    public ResponseData addWenDang() throws IOException {
        return esService.addWenDang();
    }

    @PostMapping("/deleteWenDang")
    public ResponseData deleteWenDang() throws IOException {
        return esService.deleteWenDang();
    }

}
