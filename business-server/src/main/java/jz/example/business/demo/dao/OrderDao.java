package jz.example.business.demo.dao;

import jz.example.business.demo.pojo.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order,Integer> {

    
}