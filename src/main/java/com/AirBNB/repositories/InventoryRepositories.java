package com.AirBNB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AirBNB.entity.Inventory;

@Repository
public interface InventoryRepositories extends JpaRepository<Inventory, Long>{

}
