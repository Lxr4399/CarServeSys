package com.css.dao.impl;

import java.util.List;

import com.css.dao.UserTrueDao;
import com.css.entity.UserTrue;
import com.css.util.DBUtil;

public class UsertrueDaoImpl implements UserTrueDao {

	@Override
	public boolean addUserTrue(int userId) {
		// TODO Auto-generated method stub
		return DBUtil.execute("insert into usertrue values (null,?,null,null,null,null,null,null)", userId)>0;
	}

	@Override
	public UserTrue queryByUserId(int userId) {
		// TODO Auto-generated method stub
		List<UserTrue> list = (List<UserTrue>)DBUtil.select("select * from usertrue where userId =?", UserTrue.class, userId);
		return list.get(0);
	}

	@Override
	public boolean updateUserTrue(UserTrue userTrue) {
		// TODO Auto-generated method stub
		return DBUtil.execute("update usertrue set userCardId=?,userTrueName=?,userSex=?,userAddress=?,userPhone=? where userId=?", userTrue.getUserCardId(),userTrue.getUserTrueName(),userTrue.getUserSex(),userTrue.getUserAddress(),userTrue.getUserPhone(),userTrue.getUserId())>0;
	}

	@Override
	public boolean addBankId(int userId,String bankNumber) {
		// TODO Auto-generated method stub
		return DBUtil.execute("update usertrue set bankId=? where userId=?", bankNumber,userId)>0;
	}

}
