package com.App.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.App.food.model.User;

public interface UserDao extends JpaRepository<User,String> {
}
