package com.springmvc.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Store {
	private long id;
	private int category;
	private String storeName;
	private int storeAddress1;
	private String storeAddress2;
	private String storeAddress3;
	private String storePhone;
	private String storeImg;
	private String storeThumb;
	private int openingTime;
	private int closingTime;
	private int minDelivery;
	private int deliveryTime;
	private int deliveryTip;
	private String storeDes;
}
