package com.amdocs.CargoManagementSystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.CargoManagementSystem.entity.TruckEntity;

@Repository
public interface TruckRepository extends JpaRepository<TruckEntity, Long> {

}
