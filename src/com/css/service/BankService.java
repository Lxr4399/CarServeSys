package com.css.service;

import com.css.entity.Bank;

public interface BankService {
	/**
	 * ����������������ת�˲���
	 */
		public boolean upadateBalance (float balance,int bankNumber);
		
		public float queryBalance (int bankNumber);
		/**
		 * ���п���
		 * @param bankNumber
		 * @param bankPwd
		 * @return
		 */
		public Bank bindBank (String bankNumber,String bankPwd);
		
		
		
		public Bank queryBank(int bankNumber);
		
		
		/**
		 * ���п�ת��
		 * @param ���п���
		 * @param ת�˽��
		 * @return �ɹ�����true����֮false
		 */
		public boolean accountTransfer (int bankNumber,float money); 
}
