package com.fastfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.fastfood.entity.FoodSales;

public interface FoodSalesRepo extends JpaRepository<FoodSales, Integer>{
@Query("select food from FoodSales food where food.cusname=?1 and food.phno=?2")
   FoodSales method(String cusname,int phn);

}
