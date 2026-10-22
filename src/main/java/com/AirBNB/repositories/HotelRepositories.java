package com.AirBNB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AirBNB.entity.Hotel;

@Repository
public interface HotelRepositories extends JpaRepository<Hotel, Long>{

	
	
	
}
