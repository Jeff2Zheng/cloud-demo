package jz.example.user.business.juc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import jz.example.user.business.juc.item.JucQueryPageItem;
import jz.example.user.business.juc.pojo.Juc;
import org.springframework.stereotype.Repository;

/**
 * @Author JZ
 * @Date 2022/3/26
 */
@Repository
public interface JucMapper extends BaseMapper<Juc> {


    /**
     * 用户分页
     */
    JucQueryPageItem selectJucPage(JucQueryPageItem item);

}
