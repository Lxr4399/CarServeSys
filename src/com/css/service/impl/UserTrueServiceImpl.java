package com.css.service.impl;

import com.css.dao.UserTrueDao;
import com.css.dao.impl.UsertrueDaoImpl;
import com.css.entity.UserTrue;
import com.css.service.UserTrueService;

public class UserTrueServiceImpl implements UserTrueService {
UserTrueDao dao = new UsertrueDaoImpl();

@Override
public boolean addUserTrue(int userId) {
	// TODO Auto-generated method stub
	return dao.addUserTrue(userId);
}

@Override
public UserTrue queryByUserId(int userId) {
	// TODO Auto-generated method stub
	return dao.queryByUserId(userId);
}

@Override
public boolean updateUserTrue(UserTrue userTrue) {
	// TODO Auto-generated method stub
	return dao.updateUserTrue(userTrue);
}

@Override
public boolean addBankId(int userId,String bankNumber) {
	// TODO Auto-generated method stub
	return dao.addBankId(userId,bankNumber);
}
	

}
