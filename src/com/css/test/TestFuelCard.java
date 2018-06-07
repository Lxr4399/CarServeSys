package com.css.test;

import com.css.entity.Fuelcard;
import com.css.service.FuelcardService;
import com.css.service.impl.FuelcardServiceImpl;

public class TestFuelCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuelcardService fs = new FuelcardServiceImpl();
		Fuelcard u = (Fuelcard)fs.queryFuelCard(34561231);
		System.out.println(u.toString());

	}

}
