package com.example.demo.form;

public class ReceiveForm02
{
	private String data1 ;
	private String data2 ;

	public int getConvertData1()
	{
		int rtn ;

		rtn = Integer.parseInt( data1 ) ;

		return ( rtn ) ;
	}

	public int getConvertData2()
	{
		int rtn ;

		rtn = Integer.parseInt( data2 ) ;

		return ( rtn ) ;
	}

	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}
}
