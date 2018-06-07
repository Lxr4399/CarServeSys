package com.css.test;

import com.css.entity.UserTrue;
import com.css.service.UserTrueService;
import com.css.service.impl.UserTrueServiceImpl;

public class TestUserTrue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserTrueService uts = new UserTrueServiceImpl();
//		uts.addUserTrue(2);
//		UserTrue userTrue = new UserTrue("12345", "12345", "12345", "12345", "12345", 12);
//		uts.updateUserTrue(userTrue);
//		UserTrue userTrue = uts.queryByUserId(16);
//		System.out.println(userTrue.toString());
		uts.addBankId(22, "1");

	}

}
