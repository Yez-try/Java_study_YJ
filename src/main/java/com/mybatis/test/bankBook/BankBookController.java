package com.mybatis.test.bankBook;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
		
		return "redirect:list.ms";
	}
	
	@RequestMapping(value="list.ms", method=RequestMethod.GET)
	public ModelAndView list(BankBookDTO bankBookDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		List<BankBookDTO> al = bankBookService.list(bankBookDTO);
//		System.out.println(bankBookDTO.getBookNum());
		
		mv.addObject("list", al);
		mv.setViewName("bankbook/list");
		return mv;
	}
	@RequestMapping(value="detail.ms", method=RequestMethod.GET)
	public ModelAndView detail(BankBookDTO bankBookDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		bankBookDTO = bankBookService.detail(bankBookDTO);
		
//		System.out.println(bankBookDTO.getBookNum());
//		System.out.println(bankBookDTO.getBookName());
//		System.out.println(bankBookDTO.getBookRate());
//		System.out.println(bankBookDTO.getBookSale());
		
		mv.addObject("detail", bankBookDTO);
		mv.setViewName("bankbook/detail");
		
		return mv;
		
	}
	//통장수정
	@RequestMapping(value="update.ms", method=RequestMethod.GET)
	public ModelAndView update(BankBookDTO bankBookDTO,ModelAndView mv)throws Exception{
		System.out.println("UPDATE GET 실행");
		//기존통장정보 가져오기
		bankBookDTO = bankBookService.detail(bankBookDTO);
		
		mv.addObject("update", bankBookDTO);
		mv.setViewName("/bankbook/update");
		return mv;
		
	}
	
	//통장수정
	@RequestMapping(value="update.ms" ,method= RequestMethod.POST)
	public String update(BankBookDTO bankBookDTO)throws Exception{
		System.out.println("update post 실행");
		bankBookService.update(bankBookDTO);
		System.out.println(bankBookDTO.getBookNum());
		System.out.println(bankBookDTO.getBookName());
		System.out.println(bankBookDTO.getBookRate());
		System.out.println(bankBookDTO.getBookSale());
		
		return "redirect:detail.ms?bookNum="+bankBookDTO.getBookNum();
	}
	//통장삭제
	@RequestMapping(value="delete.ms",method=RequestMethod.GET)
	public String delete(BankBookDTO bankBookDTO)throws Exception{
		bankBookService.delete(bankBookDTO);
		
		
		return "redirect:list.ms";
	}
	

	
}
