package com.fastfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fastfood.entity.FoodEntity;

public interface FoodRepository extends JpaRepository<FoodEntity, Integer> {

}
