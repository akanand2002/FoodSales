package com.fastfood.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastfood.entity.FoodSales;

import com.fastfood.service.FoodService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/food1")
public class Foodsalescontroller {
//	@Autowired
//	FoodSalesRepo food1Repo;
	
	@Autowired
	FoodService fdsev;
	
//	insert
      @PostMapping("/create")
     public FoodSales postMethodName(@RequestBody FoodSales ffd) {
	//TODO: process POST request
	FoodSales ld = fdsev.create(ffd);
     return ld;
}
      
//  get    
      @GetMapping("/findall")
      public List<FoodSales> show(FoodSales fd){
          return fdsev.show(fd);
      }
      
//      update  
      @PostMapping("/update/{id}")
      public FoodSales postMethodName(@RequestBody FoodSales fd,@PathVariable int id) {
          //TODO: process POST request
    	FoodSales update=fdsev.update(fd, id);
           return update;
      }
      
//     delete
      
     @PostMapping("/delete/{id}")
     public String postMethodName(@PathVariable int id) {
         //TODO: process POST request
        fdsev.delete(id);
        return "delete successfully";
     }
     
      
      
      

	
//	@PostMapping("/insert")
//	public String add(@RequestBody FoodSales ak)
//	{
//		 food1Repo.save(ak);
//		 return "insert sucessfully";
//	}
//	@PostMapping("/create")
//	public FoodSales postMethodName(@RequestBody FoodSales jk) {
//		//TODO: process POST request
//		 FoodSales d=salserv.insert(jk);
//		return d;
//	}
	
	
	
//@GetMapping("/get/{cusname}/{phn}")
//public FoodSales getMethodName(@PathVariable String cusname,@PathVariable int phn ) {
//    return food1Repo.method(cusname, phn);
//}

}
