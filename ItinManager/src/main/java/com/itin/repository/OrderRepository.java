package com.itin.repository;

import com.itin.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {

   OrderEntity findByOrderNumber(String orderNumber);
}
