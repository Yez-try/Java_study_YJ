package com.mybatis.test.bankMembers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankMembersService {
	
	@Autowired
	private BankMembersDAO dao;
	
	public int setJoin(BankMembersDTO dto) throws Exception{
		return dao.setJoin(dto);
	}
	
	public BankMembersDTO getLogin(BankMembersDTO dto) {
		return dao.getLogin(dto);
	}
	
	public List<BankMembersDTO> getSearchByID(BankMembersDTO dto) {
		return dao.getSearchByID(dto);
	}

}