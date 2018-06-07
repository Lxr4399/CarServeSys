package com.css.dao.impl;




import java.util.List;

import com.css.dao.UsersDao;
import com.css.entity.Users;
import com.css.util.DBUtil;
import com.css.util.PageData;

public class UsersDaoImpl implements UsersDao {

	@Override
	public PageData<Users> queryUsers(int page, int pagesize) {
		// TODO Auto-generated method stub
		return (PageData<Users>)DBUtil.getPage("select * from Users", page, pagesize, Users.class);
	}

	@Override
	public boolean addUsers(Users user) {
		// TODO Auto-generated method stub
		return DBUtil.execute("insert into users values (null,?,?,?,1,1,now())", user.getUserName(),user.getUserPwd(),user.getUserEmail())>0;
		
	}

	@Override
	public Users queryId(String userName) {
		// TODO Auto-generated method stub
		List<Users> list =(List<Users>)DBUtil.select("select * from users where userName=?", Users.class, userName);
		if (list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public Users Login(String userName, String userPwd) {
		// TODO Auto-generated method stub
		List<Users> list =(List<Users>)DBUtil.select("select * from users where userName=? and userPwd=?", Users.class, userName,userPwd);
		if (list.size()>0) {
			return list.get(0);
		}
		return null;
	}

}
