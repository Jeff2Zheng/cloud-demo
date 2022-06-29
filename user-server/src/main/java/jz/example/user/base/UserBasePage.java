package jz.example.user.base;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * @Author JZ
 * @Date 2022/4/3
 */
public class UserBasePage<T> extends Page<T> {

    public UserBasePage(long current, long size) {
        super(current, size);
    }

}
