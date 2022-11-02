package jz.example.user.business.menu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.example.user.business.menu.item.MenuInitializationItem;
import jz.example.user.business.menu.pojo.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author JZ
 * @Date 2022/3/26
 */
@Repository
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 用户分页
     */
    List<MenuInitializationItem> selectMenuData();

}
