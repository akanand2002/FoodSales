package com.fastfood.service;



import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.fastfood.entity.FoodSales;

public interface FoodService {
	FoodSales create(FoodSales fd);
   List<FoodSales> show(FoodSales fd);
   FoodSales update(@RequestBody FoodSales fd,@PathVariable int id);
   String delete(int id);
}
