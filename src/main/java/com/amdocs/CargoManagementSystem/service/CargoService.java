package com.amdocs.CargoManagementSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amdocs.CargoManagementSystem.entity.CargoEntity;

@Service
public interface CargoService {
	
	public boolean saveCargo(CargoEntity cargoEntity);
	public List<CargoEntity> getAllCargoEntities();
	
	public CargoEntity getCargoId(int id);

	public boolean updateCargo(CargoEntity cargoEntity);

	public boolean deleteCargo(int id);

}
