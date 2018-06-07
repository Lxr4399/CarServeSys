package com.css.dao;

import com.css.entity.UserTrue;

public interface UserTrueDao {
//当用户注册成功，自动添加一条用户详细表的记录，外键为userId
public boolean addUserTrue (int userId);

public UserTrue queryByUserId (int userId);

//个人信息页面，添加用户详细信息
public boolean updateUserTrue (UserTrue userTrue);
//为个人信息表一条数据绑定银行卡号
public boolean addBankId (int userId,String bankNumber);

}
