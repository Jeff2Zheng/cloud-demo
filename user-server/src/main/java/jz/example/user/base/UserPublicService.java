package jz.example.user.base;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * @Author JZ
 * @Date 2022/3/18
 */
public class UserPublicService {

    private static final Logger logger = LoggerFactory.getLogger(UserPublicService.class);

    /**
     * @Description: 预处理model信息
     * @Author: JZ
     * @date: 2022/3/20
     */
    public <T extends UserBaseModel> void preSave(T model) {
        if (ObjectUtil.isEmpty(model.getCreator())) {
            model.setCreator("1");
        }
        if (ObjectUtil.isEmpty(model.getCreateTime())) {
            model.setCreateTime(new Date());
        }
        if (ObjectUtil.isEmpty(model.getModifier())) {
            model.setModifier("1");
        }
        if (ObjectUtil.isEmpty(model.getModifyTime())) {
            model.setModifyTime(new Date());
        }
    }

}
