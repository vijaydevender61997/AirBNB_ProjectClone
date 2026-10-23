package com.AirBNB.service.implementation;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.AirBNB.dto.HotelDto;
import com.AirBNB.entity.Hotel;
import com.AirBNB.exception.ResourceNotFoundException;
import com.AirBNB.repositories.HotelRepositories;
import com.AirBNB.service.HotelService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class HotelServiceImpl implements HotelService {

	private final HotelRepositories hotelRepositories;
	private final ModelMapper modelMapper;

	@Override
	public HotelDto createHotel(HotelDto hotelDto) {

		log.info("creating new hotel with name :{}", hotelDto.getName());

		Hotel hotel = modelMapper.map(hotelDto, Hotel.class);

		hotel.setActive(false);

		hotel = hotelRepositories.save(hotel);

		log.info("created new hotel with Id :{}", hotelDto.getId());

		return modelMapper.map(hotel, HotelDto.class);
	}

	@Override
	public HotelDto getHotelById(Long id)
	{
		log.info("Getting the hotel with the Id: {}", id);

		Hotel hotel = hotelRepositories.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Hotel not found with the id:" + id));

		return modelMapper.map(hotel, HotelDto.class);
	}

}
