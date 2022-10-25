package jz.example.user.business.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.example.user.business.auth.item.InfoQueryPageItem;
import jz.example.user.business.auth.item.UserAndCompanyPageItem;
import jz.example.user.business.auth.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @Author JZ
 * @Date 2022/3/26
 */
@Repository
public interface AuthMapper extends BaseMapper<User> {

    /**
     * 用户分页
     */
    InfoQueryPageItem selectUserPage(InfoQueryPageItem item);

    /**
     * 用户分页
     */
    UserAndCompanyPageItem selectUserAndCompanyPage(UserAndCompanyPageItem item);

}
