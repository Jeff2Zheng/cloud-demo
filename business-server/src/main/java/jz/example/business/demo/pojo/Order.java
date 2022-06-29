package jz.example.business.demo.pojo;

import jz.example.business.base.BusinessBaseModel;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author JZ
 * @Date 2022/3/13
 */
@Entity
@Table(name="jz_order")
public class Order extends BusinessBaseModel {

    private Long userId;
    private String orderNo;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
