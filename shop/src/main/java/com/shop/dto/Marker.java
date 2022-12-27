package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Marker {
	private int id;
	private String title;
	private String target;
	private float lat;
	private float lng;
	private String img;
	private char loc;
}
