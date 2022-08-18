package com.mybatis.test.bankMember;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mybatis.test.MyAbstractTest;
import com.mybatis.test.bankMembers.BankMembersDTO;


public class BookMembersDAOTest extends MyAbstractTest{ //extends MyAbstractTest 를 써주면 기본 필요한 패키지들을 전부 상속 받는다.
	
	@Autowired
	private BookMemberDAO bmdao;
	
	@Test
	public void setJoinTest() throws Exception{
		int result = bmdao.setJoin("df");
		//"df"위치에 성공하는 데이터를 넣어줘보고
		//실패하는 데이터를 넣어줘본다.
		
		assertEquals(1, result);
	}
	
	@Test
	public void getLoginTest() throws Exception{
		Object dto = bmdao.getLogin("df");
		
		//테스트할때는 모든 케이스를 전부 다 해보아야 한다.
		//틀린아이디, 맞는패스워드/틀틀/맞맞/맞틀 등등..
		
		assertNull(dto);
	}
	
	@Test
	public void getSearch() throws Exception{
		List<Object> ar = bmdao.getSearch("ad");
		
		throw new Exception();
		
//		assertNotEquals(0, ar.size());
	}
}
