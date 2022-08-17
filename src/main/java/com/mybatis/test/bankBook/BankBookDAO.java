package com.mybatis.test.bankBook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.mybatis.test.bankBook.BankBookDAO.";
	
	//통장추가
	public int add(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"add",bankBookDTO);
	}
	//통장리스트
	public List<BankBookDTO> list(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.selectList(NAMESPACE+"list",bankBookDTO);
	}
	//통장상세
	public BankBookDTO detail(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"detail",bankBookDTO);
	}
	//통장수정
	public int update(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"update",bankBookDTO);
	}
	//통장삭제
	public int delete(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"delete",bankBookDTO);
	}
}
