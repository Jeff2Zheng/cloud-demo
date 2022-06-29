package jz.example.business.base;

import jz.example.business.base.util.EmptyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @Author JZ
 * @Date 2022/3/18
 */
public class BusinessPublicService {

    private static final Logger logger = LoggerFactory.getLogger(BusinessPublicService.class);

    /**
     * @Description: 预处理model信息
     * @Author: JZ
     * @date: 2022/3/20
     */
    public <T extends BusinessBaseModel> void preSave(T model) {
        if (EmptyUtil.isEmpty(model.getCreator())) {
            model.setCreator("1");
        }
        if (EmptyUtil.isEmpty(model.getCreateTime())) {
            model.setCreateTime(new Date());
        }
        if (EmptyUtil.isEmpty(model.getModifier())) {
            model.setModifier("1");
        }
        if (EmptyUtil.isEmpty(model.getModifyTime())) {
            model.setModifyTime(new Date());
        }
    }

}
