package com.amdocs.CargoManagementSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.CargoManagementSystem.Repo.CargoRepository;
import com.amdocs.CargoManagementSystem.Repo.TruckRepository;
import com.amdocs.CargoManagementSystem.entity.CargoEntity;
import com.amdocs.CargoManagementSystem.entity.TruckEntity;
import com.amdocs.CargoManagementSystem.service.CargoService;
import com.amdocs.CargoManagementSystem.service.TruckService;

@Service
public class TruckServiceImpl implements TruckService{

	
	private TruckRepository truck;
	private CargoRepository cargo;
	
	



	
	@Autowired
	public TruckServiceImpl(TruckRepository truck, CargoRepository cargo) {
		super();
		this.truck = truck;
		this.cargo = cargo;
	}

	@Override
	public List<TruckEntity> getAllTrucks() {
		// TODO Auto-generated method stub
		return truck.findAll();
	}

	@Override
	public TruckEntity saveTruck(TruckEntity truckEntity, int cno) {
		// TODO Auto-generated method stub
		CargoEntity cargoEntity = cargo.findById(cno).orElse(null);
		if(cargoEntity!=null) truckEntity.setCargo(cargoEntity);
			return truck.save(truckEntity);
	}

	@Override
	public TruckEntity getTruckById(Long isbnno) {
		// TODO Auto-generated method stub
		return truck.findById(isbnno).orElse(null);
	}

	@Override
	public TruckEntity updateTruck(int cno ,Long isbnno,TruckEntity truckentity) {
		
		// TODO Auto-generated method stub
		CargoEntity cargoEntity = cargo.findById(cno).orElse(null);
		if(cargoEntity!=null) {
		
		TruckEntity existingTruck= truck.findById(isbnno).orElse(null);
		if(existingTruck!=null)
		{
			existingTruck.setTruck_name(truckentity.getTruck_name());
			existingTruck.setManufactureDate(truckentity.getManufactureDate());
			return truck.save(existingTruck);
		}
		}
		return null;
	}

	

	@Override
	public void deleteTruck(Long isbnno) {
		// TODO Auto-generated method stub
		truck.deleteById(isbnno);
	}
	

}
