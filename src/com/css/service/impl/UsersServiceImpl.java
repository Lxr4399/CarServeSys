package com.css.service.impl;

import com.css.dao.UsersDao;
import com.css.dao.impl.UsersDaoImpl;
import com.css.entity.Users;
import com.css.service.UsersService;
import com.css.util.PageData;

public class UsersServiceImpl implements UsersService {
	UsersDao dao = new UsersDaoImpl();
    
	@Override
	public PageData<Users> queryUsers(int page, int pagesize) {
		// TODO Auto-generated method stub
		return dao.queryUsers(page, pagesize); 
	}

	@Override
	public boolean addUsers(Users user) {
		// TODO Auto-generated method stub
		return dao.addUsers(user);
	}

	@Override
	public int queryId(String userName) {
		// TODO Auto-generated method stub
		Users user = dao.queryId(userName);
		if (user!=null) {
			return user.getUserId();
		}
		return 0;
	}

	@Override
	public Users Login(String userName, String userPwd) {
		// TODO Auto-generated method stub
		return dao.Login(userName, userPwd);
	}



	
}
