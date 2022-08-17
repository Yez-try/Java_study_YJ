package com.mybatis.test.bankBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	public int add(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.add(bankBookDTO);
	}
}
