package com.mybatis.test.bankBook;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/bankbook/*")
public class BankBookController {

	@Autowired
	private BankBookService bankBookService;
	
	//통장추가
	@RequestMapping(value="add.ms", method=RequestMethod.GET)
	public void add()throws Exception{
		System.out.println("add get실행");
		
	}
	@RequestMapping(value="add.ms", method=RequestMethod.POST)
	public String add(BankBookDTO bankBookDTO)throws Exception{
		System.out.println("add post 실행");
		Calendar ca = Calendar.getInstance();
		bankBookDTO.setBookNum(ca.getTimeInMillis());
		bankBookService.add(bankBookDTO);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="list.ms", method=RequestMethod.GET)
	public void list()throws Exception{
		
	}
	

	
}
