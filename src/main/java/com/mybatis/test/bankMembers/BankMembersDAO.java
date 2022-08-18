package com.mybatis.test.bankMembers;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankMembersDAO {
	
	@Autowired
	private SqlSession session;
	private final String NAMESPACE = "com.mybatis.test.bankMembers.BankMembersDAO.";

	public int setJoin(BankMembersDTO dto) {
		return session.insert(NAMESPACE+"setJoin", dto);
	}
	
	public BankMembersDTO getLogin(BankMembersDTO dto) {
		return session.selectOne(NAMESPACE+"getLogin", dto);
	}
	
	public List<BankMembersDTO> getSearchByID(BankMembersDTO dto) {
		return session.selectList(NAMESPACE+"getSearchByID", dto);
	}
	
}
