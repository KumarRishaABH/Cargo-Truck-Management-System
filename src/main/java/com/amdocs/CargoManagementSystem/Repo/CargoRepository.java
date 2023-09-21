package com.amdocs.CargoManagementSystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.CargoManagementSystem.entity.CargoEntity;

@Repository
public interface CargoRepository extends JpaRepository<CargoEntity, Integer>{

}
