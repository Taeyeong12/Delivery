package com.springmvc.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreDetail {
	
	private Store StoreInfo;
	private List<Food> foodList;
//	private List<Review> reviewList;
	
}


