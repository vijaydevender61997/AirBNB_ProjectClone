package com.AirBNB.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class RoomDto {

	private Long id;

	private String type;

	private BigDecimal basePrice;

	private String[] photos;

	private String[] amenities;

	private Integer totalCount;

	private Integer capacity;

	
	
}
