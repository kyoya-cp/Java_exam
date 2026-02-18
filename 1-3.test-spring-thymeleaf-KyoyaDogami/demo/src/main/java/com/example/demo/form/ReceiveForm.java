package com.example.demo.form;

import java.util.List;

/**
 * リクエストパラメータ格納用クラス.
 * 
 * @author KyoyaDogami
 */
public class ReceiveForm
{
	/** 名前 */
	private String name ;

	/** 年齢 */
	private String age ;

	/** 趣味リスト */
	private List<String> hobbylist ;

	/**
	 * 文字列データをint型へ変換して提供する.
	 * 
	 * @return 年齢
	 */
	public Integer getConvertAge()
	{
		int rtn ;

		rtn = Integer.parseInt( getAge() ) ;

		return rtn ;
	}

	public String getName()
	{
		return this.name ;
	}

	public void setName( String name )
	{
		this.name = name ;
	}

	public String getAge()
	{
		return this.age ;
	}

	public void setAge( String age )
	{
		this.age = age ;
	}

	public List<String> getHobbylist()
	{
		return this.hobbylist ;
	}

	public void setHobbylist( List<String> hobbylist )
	{
		this.hobbylist = hobbylist ;
	}
}
