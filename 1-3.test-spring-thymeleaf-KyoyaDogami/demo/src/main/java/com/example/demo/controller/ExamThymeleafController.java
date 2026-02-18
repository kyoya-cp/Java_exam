package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.form.ReceiveForm;

/**
 * 画面遷移を制御する.
 * 
 * @author KyoyaDogami
 */
@Controller
@RequestMapping( "/exam" )
public class ExamThymeleafController
{
	/**
	 * View名を返す.
	 * ファーストリクエスト用<br>
	 * 
	 * @return View名
	 */
	@RequestMapping( "" )
	public String index()
	{
		return "ex-thymeleaf-input" ;
	}

	/**
	 * View名を返す.
	 * リクエストパラメータをリクエストスコープに格納する<br>
	 * 
	 * @param form
	 * @param model
	 * @return View名
	 */
	@RequestMapping( "/input-form" )
	public String inputForm( ReceiveForm form, Model model )
	{
		Member member = new Member() ;
		member.setName( form.getName() ) ;
		member.setAge( form.getConvertAge() ) ;
		member.setHobbylist( form.getHobbylist() ) ;

		model.addAttribute( "member", member ) ;

		return "ex-thymeleaf-result" ;
	}
}
