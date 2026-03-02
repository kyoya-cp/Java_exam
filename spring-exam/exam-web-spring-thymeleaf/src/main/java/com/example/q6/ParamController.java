package com.example.q6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * リクエストパラメータ<code>linkTo</code>の値を見て、フォーワード先を切り替えなさい。
 * 以下のようになるようにしなさい。
 * <pre>
 * linkTo = "1"の時、遷移先は6/first.html。
 * linkTo = "2"の時、遷移先は6/second.html。
 * 1,2以外の場合は、RuntimeExceptionをthrowしてください。
 * </pre>
 */
@Controller
@RequestMapping( "/q6" )
public class ParamController {
	@PostMapping( "/{linkTo}" )
	public String gotoq6( @PathVariable( "linkTo") int id  )
	{
		if ( id == 1 )
		{
			return "6/first" ;
		}
		else if ( id == 2 )
		{
			return "6/second" ;
		}
		else
		{
			throw new RuntimeException() ;
		}
	}

	// @GetMapping( "/q6/{val}" )
	// public String linkTo( @PathVariable( "val" ) int forwardPageNum )
	// {
	// 	switch ( forwardPageNum )
	// 	{
	// 		case 1 :
	// 			return "6/first" ;

	// 		case 2 :
	// 			return "6/second" ;

	// 		default :
	// 			throw new RuntimeException( "バラメータ不明" ) ;
	// 	}
	// }
}
