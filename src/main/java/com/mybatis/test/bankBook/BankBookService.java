package com.mybatis.test.bankBook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {

	@Autowired
	private BankBookDAO bankBookDAO;
	//통장추가
	public int add(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.add(bankBookDTO);
	}
	//통장리스트
	public List<BankBookDTO> list(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.list(bankBookDTO);
	}
	//통장상세
	public BankBookDTO detail(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.detail(bankBookDTO);
	}
	//통장수정
	public int update(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.update(bankBookDTO);
	}
	//통장삭제
	public int delete(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.delete(bankBookDTO);
	}
}
