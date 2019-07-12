package com.kembara.springbootKasir.Exception;

@SuppressWarnings("serial")
public class RegisteredException extends BaseCommonException{

	public RegisteredException(String code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public RegisteredException() {

	}

}
