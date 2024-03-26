package com.fastfood.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.fastfood.entity.FoodSales;
import com.fastfood.repository.FoodSalesRepo;
import com.fastfood.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	FoodSalesRepo fdRepo;
	public FoodSales create(FoodSales fd) {
		// TODO Auto-generated method stub
		
		FoodSales food = fdRepo.save(fd);
		return food;
	}
	public List<FoodSales> show(FoodSales fd) {
           List<FoodSales> ak = fdRepo.findAll();
		return ak;
	}
	@Override
	public FoodSales update(FoodSales fd, int id) {
		// TODO Auto-generated method stub
		FoodSales ak=fdRepo.findById(id).get();
		ak.setCusname(fd.getCusname());
		fdRepo.save(ak);
		return ak;
	}
	@Override
	public String delete(@PathVariable int id) {
		// TODO Auto-generated method stub
		 fdRepo.deleteById(id);;
		return "deleted";
	}
	 
	

	

}
