package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping( "/member" )
public class MemberController
{
	@Autowired
	private MemberRepository repository ;

	@RequestMapping( "" )
	public String index()
	{
		/** 全員の情報を取得 */
		System.out.println( "手順1\n-----------" ) ;
		List<Member> members = repository.findAll() ;

		for ( Member member : members )
		{
			printInfo( member ) ;
		}

		/** ID:2の人の情報を取得 */
		System.out.println( "手順2\n-----------" ) ;
		Member mem = repository.load( 2 ) ;
		printInfo( mem ) ;

		/** 自分の情報登録 */
		System.out.println( "手順3??\n-----------" ) ;
		Member myInfo = new Member( "KYOYA", 24, 88 ) ;

		Member insertPersonInfo = repository.save( myInfo ) ;
		printInfo( insertPersonInfo ) ;

		/** 「ジロー」を「シロー」へ更新 */
		System.out.println( "手順4??\n-----------" ) ;
		mem.setName( "シロー" ) ;
		Member updatePersonInfo = repository.save( mem ) ;
		printInfo( updatePersonInfo ) ;
 
		return "member" ;
	}

	public void printInfo( Member member )
	{
		System.out.println( "*" ) ;
		System.out.println( member.getName() + "さんの情報" ) ;
		System.out.println( "=======================" ) ;
		System.out.println( "ID:" + member.getId() ) ;
		System.out.println( "年齢:" + member.getAge() ) ;
		System.out.println( "部署ID:" + member.getDepId() ) ;
		System.out.println( "=======================" ) ;
	}
}
