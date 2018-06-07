package com.css.dao;

import com.css.entity.Users;
import com.css.util.PageData;

public interface UsersDao {
	/**
	 * 查询所有用户,模糊分页查询
	 * 
	 * @return
	 */
	public PageData<Users> queryUsers(int page, int pagesize);

	/**
	 * 添加一个用户
	 * 
	 * @param user
	 *            用户
	 * @return
	 */
	public boolean addUsers(Users user);
	
	
	public Users queryId (String userName);
	
	/**
	 * 用户登录
	 * @param userName
	 * @param userPwd
	 * @return
	 */
	public Users Login (String userName,String userPwd);
}
