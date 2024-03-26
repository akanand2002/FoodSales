package com.fastfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastfood.entity.FoodEntity;
import com.fastfood.repository.FoodRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/food")
public class FoodController {
	@Autowired
	FoodRepository foodRepo;
	
	@PostMapping("/add")
	public String addFood(@RequestBody FoodEntity Fd) {
		//TODO: process POST request
		FoodEntity F = foodRepo.save(Fd);
		
		return "add successfully";
	}
	@GetMapping("/get/{id}")
	public FoodEntity view(@PathVariable int id)
	{
		return foodRepo.findById(id).get();
	}
	
	//update
	
	@PostMapping("/update/{id}")
	
	public FoodEntity updateFood(@RequestBody FoodEntity Fd, @PathVariable int id) {
		//TODO: process POST request
		FoodEntity f = foodRepo.findById(id).get();
		f.setFoodName(Fd.getFoodName());
		foodRepo.save(f);
		return f;
	}
	@GetMapping("/delete/{id}")
	public String deleteFood(@PathVariable int id)
	{
		foodRepo.deleteById(id);
		return "delete successfully";
		
	}

	
	

}
