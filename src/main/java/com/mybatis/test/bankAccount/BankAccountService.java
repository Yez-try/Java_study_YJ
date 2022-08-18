package com.mybatis.test.bankAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService {

	@Autowired
	private BankAccountDAO bankAccountDAO;
	
	//계좌개설
	public int accountAdd(BankAccountDTO bankAccountDTO)throws Exception{
		return bankAccountDAO.accountAdd(bankAccountDTO);
	}
}
