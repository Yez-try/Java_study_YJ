package com.mybatis.test.bankAccount;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankAccountDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.mybatis.test.bankAccount.BankAccountDAO.";
	
	//계좌개설
	public int accountAdd(BankAccountDTO bankAccountDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"accountAdd",bankAccountDTO);
	}

}
