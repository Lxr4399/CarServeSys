package com.css.service;

import com.css.entity.Fuelcard;

public interface FuelcardService {

	/**
	 * ������ģ��ͨ�����Ų�ѯ���Ϳ�	
	 * @param fuelcardNumber
	 * @return
	 */
	public Fuelcard queryFuelCard (int fuelcardNumber);	


	/**
	 * ������ģ����Ϳ���Ǯ
	 * @param fuelcardNumber
	 * @return
	 */
	public boolean upadateBalance (int fuelcardNumber,float money);	

}
