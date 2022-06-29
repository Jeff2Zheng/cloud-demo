package jz.example.user.demo.service;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jz.example.user.base.UserPublicService;
import jz.example.user.base.result.ResponseData;
import jz.example.user.base.util.EmptyUtil;
import jz.example.user.demo.item.InfoQueryPageItem;
import jz.example.user.demo.item.UserAndCompanyPageItem;
import jz.example.user.demo.mapper.UserMapper;
import jz.example.user.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author JZ
 * @Date 2022/3/26
 */
@Service
public class UserService extends UserPublicService {

    @Autowired
    private UserMapper mapper;

    public User getById() {
        return mapper.selectById(1510438216128794625L);
    }

    /**
     * @Description: 新增用户、删除用户、查询用户
     * @Author: JZ
     * @date: 2022/4/3
     */
    public void save() {
        //查询
        User info = mapper.selectById("1");
        List<User> users = mapper.selectList(null);
        //新增
        User saveInfo = new User();
        saveInfo.setUserId(RandomUtil.randomNumbers(8));
        saveInfo.setEmail("924689923@qq.com");
        saveInfo.setMobile("17859911367");
        saveInfo.setCompanyId(1l);
        saveInfo.setPwd("123456");
        saveInfo.setName("郑小铃");
        saveInfo.setSex("0");
        saveInfo.setIdCardNo("352202199506062513");
        preSave(saveInfo);
        int saveCount = mapper.insert(saveInfo);
        if(saveCount > 0){
            System.out.println("新增成功");
        }
        //删除
        int deleteCount = mapper.deleteById(1);
        if(deleteCount > 0 ){
            System.out.println("删除成功");
        }

        //自定义查询
        LambdaQueryWrapper<User> lambdaQueryWrapper = Wrappers.<User>lambdaQuery();
        lambdaQueryWrapper.like(User::getName,"郑");
        List<User> userList =  mapper.selectList(lambdaQueryWrapper);
       if(ObjectUtil.isNotEmpty(users)){

       }
    }

    /**
     * @Description: LambdaQueryWrapper查询用户
     * @Author: JZ
     * @date: 2022/4/3
     */
    public void wrapperQuery(){
        //自定义查询
        LambdaQueryWrapper<User> lambdaQueryWrapper = Wrappers.lambdaQuery();
        lambdaQueryWrapper.like(User::getName,"郑");
        List<User> userList =  mapper.selectList(lambdaQueryWrapper);
        if(ObjectUtil.isNotEmpty(userList)){
            System.out.println("查询成功");
        }

        // 参数一：当前页
        // 参数二：页面大小
        // 使用了分页插件之后，所有的分页操作也变得简单了
        Page<User> page =new Page<>(1,10);
        Page<User> pageList = mapper.selectPage(page,null);

        QueryWrapper<User> wrapper =new QueryWrapper<>();
        wrapper.isNotNull("name");
        List<User> userLists = mapper.selectList(wrapper);

        if(EmptyUtil.isNotEmpty(pageList)){

        }
    }

    /**
     * @Description: xml自定义分页查询
     * @Author: JZ
     * @date: 2022/4/3
     */
    public ResponseData page(InfoQueryPageItem pageItem){
        InfoQueryPageItem userPage = mapper.selectUserPage(pageItem);
        return ResponseData.success(userPage);
    }

    /**
     * @Description: xml自定义多表分页查询
     * @Author: JZ
     * @date: 2022/4/3
     */
    public ResponseData page2(UserAndCompanyPageItem pageItem){
        UserAndCompanyPageItem userPage = mapper.selectUserAndCompanyPage(pageItem);
        return ResponseData.success(userPage);
    }

}
