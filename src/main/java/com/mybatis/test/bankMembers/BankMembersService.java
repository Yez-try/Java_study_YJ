package com.mybatis.test.bankMembers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankMembersService {
	
	@Autowired
	private BankMembersDAO dao;
	
	public int setJoin(BankMembersDTO dto) throws Exception{
		return dao.setJoin(dto);
	}

}