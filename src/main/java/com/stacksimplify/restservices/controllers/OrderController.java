package com.stacksimplify.restservices.controllers;


import com.stacksimplify.restservices.entities.Order;
import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.exceptions.UserNotFoundException;
import com.stacksimplify.restservices.repositories.OrderRepository;
import com.stacksimplify.restservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class OrderController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    //get All Orders for a user
    @GetMapping("/{userid}/orders")
    public List<Order> getAllOders(@PathVariable Long userid) throws UserNotFoundException {
        Optional<User> userOptional = userRepository.findById(userid);
        if(!userOptional.isPresent())
            throw new UserNotFoundException("User Not Found");
        return userOptional.get().getOrders();
    }

    //Create Order
    @PostMapping("{userid}/orders")
    public Order createOrder(@PathVariable Long userid, @RequestBody Order order) throws UserNotFoundException {
        Optional<User> userOptional = userRepository.findById(userid);

        if(!userOptional.isPresent())
            throw new UserNotFoundException("User NOt Found");

        User user = userOptional.get();
        order.setUser(user);
        return orderRepository.save(order);
    }
}
