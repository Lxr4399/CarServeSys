package com.css.dao;

import com.css.entity.Fuelcard;

public interface  FuelcardDao {

	
/**
 * 方法，模拟通过卡号查询加油卡	
 * @param fuelcardNumber
 * @return
 */
public Fuelcard queryFuelCard (int fuelcardNumber);	


/**
 * 方法，模拟加油卡加钱
 * @param fuelcardNumber
 * @return
 */
public boolean upadateBalance (int fuelcardNumber,float money);
}
