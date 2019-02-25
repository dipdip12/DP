package com.dp.creational.builder;

import com.dp.creational.builder.Sub.SubBuilder;

public class BuilderTest {

	public static void main(String[] args) {
		
		Sub basicSub = new SubBuilder("MultiGrain", "Mexican Patty", "White").build();
		Sub customizedSub = new SubBuilder("MultiGrain", "Mexican Patty", "Red").setCapsicum(true).setOnion(true).setTomato(true).build();
		System.out.println(basicSub);
		System.out.println(customizedSub);
	}

}
