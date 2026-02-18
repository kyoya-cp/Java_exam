package com.example.demo.domain;

import java.util.List;

/**
 * メンバー情報格納用クラス.
 * 
 * @author KyoyaDogami
 */
public class Member
{
	/** 名前 */
	private String name ;

	/** 年齢 */
	private Integer age ;

	/** 趣味リスト */
	private List<String> hobbylist ;

	public String getName()
	{
		return this.name ;
	}

	public void setName( String name )
	{
		this.name = name ;
	}

	public Integer getAge()
	{
		return this.age ;
	}

	public void setAge( Integer age )
	{
		this.age = age ;
	}

	public List<String> getHobbylist()
	{
		return this.hobbylist ;
	}

	public void setHobbylist( List<String> hobbylist )
	{
		this.hobbylist = hobbylist;
	}
}
