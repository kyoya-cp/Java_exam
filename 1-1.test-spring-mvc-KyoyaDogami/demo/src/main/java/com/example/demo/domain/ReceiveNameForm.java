package com.example.demo.domain;

public class ReceiveNameForm
{
	private String name ;

	public String getName()
	{
		return this.name ;
	}

	public void setName( String name )
	{
		this.name = name ;
	}

	@Override
	public String toString()
	{
		return ( "ReceiveNameForm [name=" + getName() + "]" ) ;
	}
}
