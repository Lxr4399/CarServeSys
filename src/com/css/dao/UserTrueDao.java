package com.css.dao;

import com.css.entity.UserTrue;

public interface UserTrueDao {
//���û�ע��ɹ����Զ����һ���û���ϸ��ļ�¼�����ΪuserId
public boolean addUserTrue (int userId);

public UserTrue queryByUserId (int userId);

//������Ϣҳ�棬����û���ϸ��Ϣ
public boolean updateUserTrue (UserTrue userTrue);
//Ϊ������Ϣ��һ�����ݰ����п���
public boolean addBankId (int userId,String bankNumber);

}
