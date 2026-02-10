package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.CalcData;
import com.example.demo.form.ReceiveForm02;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping( "/exam02" )
public class Exam02Controller
{
	@Autowired
	private HttpSession session ;

	@RequestMapping( "" )
	public String index()
	{
		return ( "exam02" ) ;
	}

	@RequestMapping( "/calc" )
	public String calc( ReceiveForm02 form )
	{
		CalcData calcData = new CalcData() ;
		calcData.setData1( form.getConvertData1() ) ;
		calcData.setData2( form.getConvertData2() ) ;
		calcData.setCalcRslt( form.getConvertData1() + form.getConvertData2() ) ;

		session.setAttribute( "calcData", calcData ) ;

		return ( "exam02-result" ) ;
	}

	@RequestMapping( "/screen-transition1" )
	public String screenTransition1()
	{
		return ( "exam02-result" ) ;
	}

	@RequestMapping( "/screen-transition2" )
	public String screenTransition2()
	{
		return ( "exam02-result2" ) ;
	}
}
