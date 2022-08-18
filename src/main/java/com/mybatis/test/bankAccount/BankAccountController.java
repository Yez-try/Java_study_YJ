package com.mybatis.test.bankAccount;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mybatis.test.bankMembers.BankMembersDTO;

@Controller
@RequestMapping(value="/bankaccount/*")
public class BankAccountController {

	@Autowired
	private BankAccountService bankAccountService;
	
	//통장개설
	@RequestMapping(value="add.ms",method=RequestMethod.GET)
	public String accountAdd(BankAccountDTO bankAccountDTO,HttpSession session)throws Exception{
		System.out.println("accountAdd get 실행");
		BankMembersDTO bankMembersDTO=(BankMembersDTO)session.getAttribute("user");
		bankAccountDTO.setId(bankMembersDTO.getId());
		bankAccountService.accountAdd(bankAccountDTO);
	
		return "redirect:../bankbook/list.ms";
	}
	
	
	
}
