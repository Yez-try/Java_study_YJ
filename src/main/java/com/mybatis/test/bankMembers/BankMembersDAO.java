package com.mybatis.test.bankMembers;

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
	
}
