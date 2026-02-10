package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.ReceiveForm01;

@Controller
@RequestMapping( "/exam01" )
public class Exam01Controller
{
	@RequestMapping( "" )
	public String index()
	{
		return ( "exam01" ) ;
	}

	@RequestMapping( "/input-form" )
	public String inputForm( ReceiveForm01 form, Model model )
	{
		if ( form.getEmail().equals("yamada@sample.com") && form.getPassword().equals("yamayama") )
		{
			model.addAttribute( "result", "成功" ) ;
		}
		else
		{
			model.addAttribute( "result", "失敗" ) ;
		}

		return ( "exam01-result" ) ;
	}
}
