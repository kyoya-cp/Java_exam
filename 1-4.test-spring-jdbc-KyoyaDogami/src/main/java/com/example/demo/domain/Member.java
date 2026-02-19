package com.example.demo.domain;

/**
 * メンバー情報を表すドメイン.
 * 
 * @author igamasayuki
 *
 */
public class Member
{
	/** ID */
	private Integer id ;

	/** 名前 */
	private String name ;

	/** 年齢 */
	private Integer age ;

	/** 部署ID */
	private Integer depId ;

	/**
	 * 引数無しコンストラクタ.
	 * 
	 */
	public Member() {}

	/**
	 * 引数有コンストラクタ(データ挿入処理用).
	 * idは自動採番のため、未指定とする<br>
	 * 
	 * @param name
	 * @param age
	 * @param depId
	 */
	public Member( String name, Integer age, Integer depId )
	{
		setName( name ) ;
		setAge( age ) ;
		setDepId( depId ) ;
	}

	public Integer getId()
	{
		return this.id ;
	}

	public void setId( Integer id )
	{
		this.id = id ;
	}

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

	public Integer getDepId()
	{
		return this.depId ;
	}

	public void setDepId( Integer depId )
	{
		this.depId = depId ;
	}
}
