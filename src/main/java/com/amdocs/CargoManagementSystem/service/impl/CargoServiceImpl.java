package com.amdocs.CargoManagementSystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.CargoManagementSystem.Repo.CargoRepository;
import com.amdocs.CargoManagementSystem.entity.CargoEntity;
import com.amdocs.CargoManagementSystem.service.CargoService;


@Service
public class CargoServiceImpl implements CargoService{
	
	@Autowired
	private CargoRepository cargoRepository;

	@Override
	public boolean saveCargo(CargoEntity cargoEntity) {
		// TODO Auto-generated method stub
		// interact db s/w to store data into the database

				CargoEntity cargoSave = cargoRepository.save(cargoEntity);
				boolean flag = false;

				if (cargoSave != null)
					flag=true;
		return flag;
	}

	@Override
	public List<CargoEntity> getAllCargoEntities() {
		// TODO Auto-generated method stub
		List <CargoEntity> cargoRecords = cargoRepository.findAll();
		return cargoRecords;
	}

	@Override
	public CargoEntity getCargoId(int id) {
		// TODO Auto-generated method stub
		Optional<CargoEntity> cargoId = cargoRepository.findById(id);
		CargoEntity cargoEntity = cargoId.get();
		return cargoEntity;
	}

	@Override
	public boolean updateCargo(CargoEntity cargoEntity) {
		// TODO Auto-generated method stub
		return saveCargo(cargoEntity);
		
	}

	@Override
	public boolean deleteCargo(int id) {
		// TODO Auto-generated method stub
		CargoEntity cargoEntity = getCargoId(id);
		boolean flag=false;
		if(cargoEntity!=null)
		{
			cargoRepository.delete(cargoEntity);
		flag=true;	
		}
		
		return flag;
		
	}

}

