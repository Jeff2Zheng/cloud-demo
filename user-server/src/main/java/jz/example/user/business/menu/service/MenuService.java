package jz.example.user.business.menu.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import jz.example.user.base.UserPublicService;
import jz.example.user.business.menu.mapper.MenuMapper;
import jz.example.user.business.menu.pojo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author JZ
 * @Date 2022/10/26
 */
@Service
public class MenuService extends UserPublicService{

    @Autowired
    private MenuMapper mapper;

    /**
     * @Description: 获取列表数据
     * @Author: JZ
     * @date: 2022/10/26
     */
    public List<Menu> get(){
        LambdaQueryWrapper<Menu> wrapper = Wrappers.<Menu>lambdaQuery();
        return mapper.selectList(wrapper);
    }


}
