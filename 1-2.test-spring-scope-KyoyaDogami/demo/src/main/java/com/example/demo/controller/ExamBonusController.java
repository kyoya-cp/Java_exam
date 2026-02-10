package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.ReceiveFormBonus;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping( "/exam-bonus" )
public class ExamBonusController
{
	@Autowired
	private HttpSession session ;

	@RequestMapping( "" )
	public String index()
	{
		return ( "exam-bonus" ) ;
	}

	@RequestMapping( "/input-form" )
	public String inputForm( ReceiveFormBonus form, Model model )
	{
		if ( form.getEmail().equals("yamada@sample.com") && form.getPassword().equals("yamayama") )
		{
			User user = new User() ;
			user.setName( "山田太郎" ) ;
			user.setEmail( form.getEmail() ) ;
			user.setAge( 18 ) ;

			session.setAttribute( "user", user ) ;

			return ( "exam-bonus-result" ) ;
		}
		else
		{
			model.addAttribute( "message", "ログインに失敗しました" ) ;
			return ( "exam-bonus-input" ) ;
		}
	}
}
