package com.css.service.impl;

import com.css.dao.FuelcardDao;
import com.css.dao.impl.FuelcardDaoImpl;
import com.css.entity.Fuelcard;
import com.css.service.FuelcardService;

public class FuelcardServiceImpl implements FuelcardService{
	FuelcardDao dao = new FuelcardDaoImpl();
	@Override
	public Fuelcard queryFuelCard(int fuelcardNumber) {
		// TODO Auto-generated method stub
		return dao.queryFuelCard(fuelcardNumber);
	}

	@Override
	public boolean upadateBalance(int fuelcardNumber, float money) {
		// TODO Auto-generated method stub
		return dao.upadateBalance(fuelcardNumber, money);
	}

}
