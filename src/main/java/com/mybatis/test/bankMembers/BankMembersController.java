package com.mybatis.test.bankMembers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping(value = "login.mg", method=RequestMethod.GET)
	public void login() throws Exception{
		System.out.println("로그인페이지 실행");
	}
	
	@RequestMapping(value = "login.mg", method=RequestMethod.POST)
	public ModelAndView login(ModelAndView mv, BankMembersDTO dto) throws Exception{
	System.out.println("db 로그인 확인 실행");
	
	dto = service.getLogin(dto);
	mv.addObject("user",dto);
	mv.setViewName("redirect:../");
	
	return mv;
	}
	
	@RequestMapping(value = "search.mg", method=RequestMethod.GET)
	public void search() throws Exception{
		System.out.println("search페이지 실행");
	}
	
	@RequestMapping(value = "list.mg", method=RequestMethod.GET)
	public HttpServletRequest list(HttpServletRequest request, String search) throws Exception{
		System.out.println("db에서 getsearchbyid");
		
		BankMembersDTO dto = new BankMembersDTO();
		dto.setId(search);
		
		System.out.println(dto.getId());
		
		List<BankMembersDTO> memberList = service.getSearchByID(dto);
		request.setAttribute("memberList", memberList);

		
		return request;
	}

}
