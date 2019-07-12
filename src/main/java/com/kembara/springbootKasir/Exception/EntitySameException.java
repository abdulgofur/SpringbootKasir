package com.kembara.springbootKasir.Exception;

@SuppressWarnings("serial")
public class EntitySameException extends BaseCommonException{

	public EntitySameException(String code,String description) {
		this.code = code;
		this.description = description;
	}
	
	public EntitySameException() {

	}
}
