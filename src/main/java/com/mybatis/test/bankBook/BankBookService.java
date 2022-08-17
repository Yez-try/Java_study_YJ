package com.mybatis.test.bankBook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	public int add(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.add(bankBookDTO);
	}
	public List<BankBookDTO> list(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.list(bankBookDTO);
	}
}
