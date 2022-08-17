package com.mybatis.test.bankMembers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member/*")
public class BankMembersController {
	
	@Autowired
	private BankMembersService service;
	
	@RequestMapping(value = "join.mg", method=RequestMethod.GET)
	public void join() throws Exception{
		System.out.println("회원가입페이지 실행");
	}
	
	@RequestMapping(value = "join.mg", method=RequestMethod.POST)
	public String join(BankMembersDTO dto) throws Exception{
		System.out.println("회원가입 요청");
		
		if(dto.getLv().equals("SYSMANAGER")) {
			dto.setLv("MANAGER");			
		}else {
			dto.setLv("NORMAL");
		}
		
		int chk = service.setJoin(dto);
		if(chk==1) {
			System.out.println("가입완료");
		}else {
			System.out.println("가입실패");
		}
		
		return "redirect:../";
	}

}
