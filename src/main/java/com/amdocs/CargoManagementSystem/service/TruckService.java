package com.amdocs.CargoManagementSystem.service;

import java.util.List;


import com.amdocs.CargoManagementSystem.entity.TruckEntity;

public interface TruckService {

	public List<TruckEntity> getAllTrucks();
	public TruckEntity saveTruck(TruckEntity truckEntity, int cno);
	public TruckEntity getTruckById(Long isbnno);
	public TruckEntity updateTruck(int cno,Long isbnno, TruckEntity truck);
	public void deleteTruck(Long isbnno);
}
