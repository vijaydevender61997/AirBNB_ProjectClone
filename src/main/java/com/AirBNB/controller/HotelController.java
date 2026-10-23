package com.AirBNB.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.AirBNB.dto.HotelDto;
import com.AirBNB.service.HotelService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/admin/hotels")
@RequiredArgsConstructor
@Slf4j
public class HotelController {

	private final HotelService hotelService;

	@PostMapping
	ResponseEntity<HotelDto> createHotel(@RequestBody HotelDto hotelDto) {
		log.info("Attempting to create a new hotel with name{}" + hotelDto.getName());
		HotelDto newHotel = hotelService.createHotel(hotelDto);

		return new ResponseEntity<>(newHotel, HttpStatus.CREATED);
	}

	@GetMapping("/{hotelId}")
	public ResponseEntity<HotelDto> getHotelById(@PathVariable Long hotelId) {
		log.info("Getting Hotel with id {}" + hotelId);

		HotelDto hotel = hotelService.getHotelById(hotelId);

		return new ResponseEntity<>(hotel, HttpStatus.OK);
	}

}
