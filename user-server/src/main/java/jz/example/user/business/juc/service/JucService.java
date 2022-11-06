package jz.example.user.business.juc.service;

import jz.example.user.base.UserPublicService;
import jz.example.user.base.result.ResponseData;
import jz.example.user.business.juc.item.JucQueryPageItem;
import jz.example.user.business.juc.mapper.JucMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author JZ
 * @Date 2022/10/26
 */
@Service
public class JucService extends UserPublicService{

    @Autowired
    private JucMapper mapper;

    /**
     * @Description: juc分页
     * @Author: JZ
     * @date: 2022/11/6
     */
    public ResponseData page(JucQueryPageItem pageItem){
        JucQueryPageItem jucQueryPageItem = mapper.selectJucPage(pageItem);
        return ResponseData.success(jucQueryPageItem);
    }

}
