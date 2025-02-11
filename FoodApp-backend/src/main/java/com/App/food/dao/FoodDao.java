package com.App.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.App.food.model.Food;


public interface FoodDao extends JpaRepository<Food,String> {

}
