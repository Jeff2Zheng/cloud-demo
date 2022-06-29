package jz.example.business.base;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * @Author JZ
 * @Date 2022/4/3
 */
public class BusinessBasePage<T> extends Page<T> {

    public BusinessBasePage(long current, long size) {
        super(current, size);
    }

}
