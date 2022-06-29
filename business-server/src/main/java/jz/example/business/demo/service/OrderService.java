package jz.example.business.demo.service;

import jz.example.business.demo.dao.OrderDao;
import jz.example.business.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @Author JZ
 * @Date 2022/3/13
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public List<Order> findAll(){
        return orderDao.findAll();
    }

}
