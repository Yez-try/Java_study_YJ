package com.mybatis.test.bankMember;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookMemberDAO {

	@Autowired //만들어진 객체 주입 //객체 만드는 코드는 xml파일의 bean
	private SqlSession session;
	
	//join메서드를 테스트 해본다고 치자
	public int setJoin(String userName) throws Exception{
		return 1;
	}
	
	public Object getLogin(String userName) throws Exception{
		return null;
	}
	
	public List<Object> getSearch(String search) throws Exception{
		ArrayList<Object> ar = new ArrayList<Object>();
		
		return ar;
	}
}
