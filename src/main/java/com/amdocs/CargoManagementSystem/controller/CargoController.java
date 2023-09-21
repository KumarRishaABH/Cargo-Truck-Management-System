package com.amdocs.CargoManagementSystem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.amdocs.CargoManagementSystem.entity.CargoEntity;
import com.amdocs.CargoManagementSystem.service.CargoService;

@Controller
public class CargoController {
	
	@Autowired
	private CargoService cargoService;
	
	@RequestMapping("/")
	public String loadForm(Model model)
	{
		CargoEntity cargoEntity=new CargoEntity();
		model.addAttribute("cargoEntity",cargoEntity);
		
		return "CargoReg";
	}
	
	@RequestMapping("/insert")
	public String handleCargoForm(@ModelAttribute("cargoEntity")CargoEntity cargoEntity,Model model)
	{
		// interact to service layer
		boolean saveCargo=cargoService.saveCargo(cargoEntity);
		
		String msg="";
		
		if(saveCargo)
		{
			msg="Data Inserted Successfully";
		}
		else {
			msg="Data not inserted successfully";
		}
		model.addAttribute("msg", msg);
		return "CargoReg";	
	}

	@RequestMapping("/viewAll")
	public String viewAllCargo(Model model)
	{
		//fetch the data from the database , can interact service layer
		List <CargoEntity> allCargo = cargoService.getAllCargoEntities();
		model.addAttribute("cargos", allCargo);
		return "view";
	}
	@RequestMapping("/deleteCargo")
	public String deleteCargo(@RequestParam("cid") int id)
	{
		boolean flag = cargoService.deleteCargo(id);
		if(flag)
			return "redirect:/viewAll";
		else
			return "redirect:/viewAll";
		
	}
	@RequestMapping("/editCargo")
	public String editCargo(@RequestParam("cid") int id,Model model) {
		CargoEntity cargoEntity=cargoService.getCargoId(id);
		
		model.addAttribute("cargoEntity",cargoEntity);
		return "editCargo";
	}
	@RequestMapping("/update")
	public String updateCargo(CargoEntity cargoEntity) {
		boolean updatecargo=cargoService.updateCargo(cargoEntity);
		return "redirect:/viewAll";
	}
	

}
