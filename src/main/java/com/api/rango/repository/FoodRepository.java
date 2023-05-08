package com.api.rango.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.rango.model.FoodModel;

public interface FoodRepository extends JpaRepository<FoodModel, Long> {
    
}
