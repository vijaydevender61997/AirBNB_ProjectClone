package com.AirBNB.service;

import com.AirBNB.dto.HotelDto;
import com.AirBNB.entity.Hotel;

public interface HotelService {

	HotelDto createHotel(HotelDto hotelDto);
	
	HotelDto getHotelById(Long id);
	
}
