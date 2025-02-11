package com.App.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.App.food.model.Cart;

public interface CartDao extends JpaRepository<Cart,Integer> {
}
