package jz.example.user.jzplatform.config.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jz.example.user.base.UserPublicService;
import jz.example.user.jzplatform.config.mapper.ConfigMapper;
import jz.example.user.jzplatform.config.pojo.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: JZ
 * @date: 2022/9/7
 */
@Service
public class ConfigService extends UserPublicService{

    @Autowired
    private ConfigMapper mapper;

   /**
    * @Description: 配置详情
    * @Author: JZ
    * @date: 2022/9/6
    */
    public Config getConfigInfo() {
        List<Config> configs = mapper.selectList(new QueryWrapper());
        return configs.get(0);
    }
}
