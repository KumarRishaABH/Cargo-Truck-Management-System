package com.amdocs.CargoManagementSystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.CargoManagementSystem.entity.TruckEntity;
import com.amdocs.CargoManagementSystem.service.TruckService;

import net.bytebuddy.asm.Advice.Return;

@RestController
@RequestMapping("/trucks")
public class TruckController {
	
	private TruckService truckService;

	public TruckController(TruckService truckService) {
		//super();
		// TODO Auto-generated constructor stub
		this.truckService=truckService;
	}
	//Basic URI for API Testing
	
		//http://localhost:8085/trucks
		
		//insert into book_entity(book_name, pub_date)values(?,?);
		//http://localhost:8085/trucks/insert
	@PostMapping("/insertTruck/{cno}")
	public TruckEntity saveTruck(@RequestBody TruckEntity truck, @PathVariable int cno )
	{
		return truckService.saveTruck(truck, cno);
	}
	//select *from book_entity
		//http://localhost:8085/trucks/allTrucks
	@GetMapping("/allTrucks")
	public List<TruckEntity> getAllTrucks(){
	return truckService.getAllTrucks();
	}
	@GetMapping("/{isbnno}")
	public TruckEntity getTruckById(@PathVariable Long isbnno) {
		return truckService.getTruckById(isbnno);
	}
	
	@PutMapping("/updateTruck/{cno}/{isbnno}")
	public TruckEntity updateTruck(@PathVariable int cno,@PathVariable Long isbnno,@RequestBody TruckEntity truck) {
		return truckService.updateTruck(cno,isbnno, truck);
	}
	
	@DeleteMapping("/delete/{isbnno}")
	public void deleteTruck(@PathVariable Long isbnno) {
		truckService.deleteTruck(isbnno);
	}
	
}
