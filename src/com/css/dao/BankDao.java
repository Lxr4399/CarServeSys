package com.css.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.css.entity.Bank;
import com.css.service.BankService;
import com.css.service.FuelcardService;
import com.css.service.impl.BankServiceImpl;
import com.css.service.impl.FuelcardServiceImpl;
import com.css.util.DBUtil;

public interface BankDao {
/**
 * ����������������ת�˲���
 */
	public boolean upadateBalance (float balance,int bankNumber);
	/**
	 * ����ѯ�����������ж�
	 */
	public Bank queryByUserId (int bankNumber);
	
	/**
	 * ���п���
	 * @param bankNumber
	 * @param bankPwd
	 * @return
	 */
	public Bank bindBank (String bankNumber,String bankPwd);
	
	
	/**
	 * �������п��Ż�ȡ���п�����ǰ�����Ѱ�
	 * 
	 */
	public Bank queryBank (int bankNumber);
	
	/**
	 * ���п�ת��
	 * @param ���п���
	 * @param ת�˽��
	 * @return �ɹ�����true����֮false
	 */
	public boolean accountTransfer (int bankNumber,float money); 
}
