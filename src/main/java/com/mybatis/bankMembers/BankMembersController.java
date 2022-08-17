package com.mybatis.bankMembers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BankMembersController {
	
	@Autowired
	private BankMembersService service;

}
