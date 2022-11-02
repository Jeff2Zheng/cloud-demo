package jz.example.user.business.menu.service;

import jz.example.user.base.UserPublicService;
import jz.example.user.business.menu.item.MenuInitializationItem;
import jz.example.user.business.menu.mapper.MenuMapper;
import jz.example.user.util.MenuTypeDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<MenuInitializationItem> get(){
        List<MenuInitializationItem> data = mapper.selectMenuData();
        //父菜单
        List<MenuInitializationItem> parentData = data.stream().filter(e -> MenuTypeDict.FARENT_MENU.equals(e.getAuthLevel())).collect(Collectors.toList());
        for (MenuInitializationItem info : parentData) {
            //父菜单底下的子菜单
            List<MenuInitializationItem> children = data.stream().filter(e -> info.getId().equals(e.getParentId())).collect(Collectors.toList());
            info.setChildren(children);
        }
        return parentData;
    }

}
