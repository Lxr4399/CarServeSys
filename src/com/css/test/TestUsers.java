package com.css.test;

import com.css.dao.UsersDao;
import com.css.dao.impl.UsersDaoImpl;
import com.css.entity.Users;
import com.css.service.UsersService;
import com.css.service.impl.UsersServiceImpl;
import com.css.util.PageData;

public class TestUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		UsersDao dao = new UsersDaoImpl();
//		PageData<Users> pd = dao.queryUsers(1, 1);
//		for (Users user : pd.getData()) {
//			System.out.println(user);
		UsersService us =new UsersServiceImpl();
	       
	//}
		Users user= us.Login("Æ¶Ãñ", "123");
		System.out.println(user.toString());
		
		
      
	}

}
