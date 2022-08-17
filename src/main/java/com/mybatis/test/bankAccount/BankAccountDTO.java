package com.mybatis.test.bankAccount;

import java.sql.Date;

public class BankAccountDTO {
	
	private Long acNum;
	private String id;
	private Long bookNum;
	private Date acDate;
	
	
	public Long getAcNum() {
		return acNum;
	}
	public void setAcNum(Long acNum) {
		this.acNum = acNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getBookNum() {
		return bookNum;
	}
	public void setBookNum(Long bookNum) {
		this.bookNum = bookNum;
	}
	public Date getAcDate() {
		return acDate;
	}
	public void setAcDate(Date acDate) {
		this.acDate = acDate;
	}

}
