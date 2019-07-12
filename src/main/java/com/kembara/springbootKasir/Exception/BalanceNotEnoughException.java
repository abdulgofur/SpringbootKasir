package com.kembara.springbootKasir.Exception;
@SuppressWarnings("serial")
public class BalanceNotEnoughException extends BaseCommonException{

	public BalanceNotEnoughException(String code, String description){
		this.code = code;
		this.description = description;
	}
	
	public BalanceNotEnoughException(){

	}
}
