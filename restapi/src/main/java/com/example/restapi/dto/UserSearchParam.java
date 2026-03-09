package com.example.restapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserSearchParam
{
	@NotBlank( message = "貴様はだれだ？" )
	private String name ;

	@NotBlank( message = "ん？操作ミスかい？" )
	@Email( message = "メアド形式でよろ～" )
	private String email ;

	public UserSearchParam() {}

	public UserSearchParam( String name, String email ) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserSearchParam [getName()=" + getName() + ", getEmail()=" + getEmail() + "]";
	}
}
