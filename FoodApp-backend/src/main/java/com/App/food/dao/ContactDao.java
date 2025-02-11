package com.App.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.App.food.model.Contact;

public interface ContactDao extends JpaRepository<Contact,Integer> {
}
