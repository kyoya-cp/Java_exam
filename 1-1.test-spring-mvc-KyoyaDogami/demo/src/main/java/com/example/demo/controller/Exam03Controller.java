package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.ReceiveNameForm;

@Controller
@RequestMapping( "/exam03" )
public class Exam03Controller
{
	@RequestMapping( "" )
	public String index()
	{
		return ( "name-form" ) ;
	}

	@RequestMapping( "/receive" )
	public String receive( String name )
	{
		System.out.println( "入力された名前は" + name + "です。" ) ;

		return ( "finished" ) ;
	}

	@RequestMapping( "/receive-form" )
	public String receiveForm( ReceiveNameForm form )
	{
		System.out.println( "入力された名前は" + form.getName() + "です。" ) ;

		return ( "finished" ) ;
	}
}
