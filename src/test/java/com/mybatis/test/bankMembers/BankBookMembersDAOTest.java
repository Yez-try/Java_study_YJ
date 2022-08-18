package com.mybatis.test.bankMembers;

import org.springframework.beans.factory.annotation.Autowired;

import com.mybatis.test.MyAbstracttest;

public class BankBookMembersDAOTest extends MyAbstracttest{
	
	@Autowired
	private BankMembersDAO bankMembersDAO;
	
//	@Test
//	public void setJoinTest(BankMembersDTO bankMembersDTO)throws Exception{
//	int result =bankMembersDAO.setJoin(bankMembersDTO);
//	
//	assertEquals(0, result); //(희망값,실제값)
//	}
//	@Test
//	public void getLoginTest()throws Exception{
//		Object object = bankMembersDAO.getLogin("df");
//		assertNull(object);
//		
//	}
//	@Test
//	public void getSearch()throws Exception{
//		List<Object> al = bankMembersDAO.getSearch("11");
//		throw new Exception();	//문제가 발생한곳을 알수있는듯
//		assertNotEquals(0, al.size());
//	}
	
	

}
