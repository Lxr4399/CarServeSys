package com.css.dao.impl;

import java.util.List;

import com.css.dao.FuelcardDao;
import com.css.entity.Fuelcard;
import com.css.util.DBUtil;

public class FuelcardDaoImpl implements FuelcardDao{

	@Override
	public Fuelcard queryFuelCard(int fuelcardNumber) {
		// TODO Auto-generated method stub
		List <Fuelcard> list = (List <Fuelcard>)DBUtil.select("select * from fuelcard where fuelcardNumber=?", Fuelcard.class, fuelcardNumber);
		if (list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public boolean upadateBalance(int fuelcardNumber,float money) {
		// TODO Auto-generated method stub
		return DBUtil.execute("update fuelcard set fuelcardBalance=fuelcardBalance+? where fuelcardNumber=?",money,fuelcardNumber)>0;
	}

}
