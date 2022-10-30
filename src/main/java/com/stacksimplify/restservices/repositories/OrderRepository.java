package com.stacksimplify.restservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stacksimplify.restservices.entities.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


}
