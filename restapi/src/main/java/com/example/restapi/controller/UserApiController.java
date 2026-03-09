package com.example.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.domain.User;
import com.example.restapi.dto.UserRequest;
import com.example.restapi.dto.UserResponse;
import com.example.restapi.dto.UserSearchParam;
import com.example.restapi.service.UserService;

import jakarta.validation.Valid;

/**
 * ユーザー情報を管理するREST APIコントローラー
 */
@RestController
@RequestMapping( "/users" )
@CrossOrigin( origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE } )
@Validated
public class UserApiController
{
	private final UserService userService;

	@Autowired
	public UserApiController( UserService userService )
	{
		this.userService = userService ;
	}

	// パスパラメータを使ったGETメソッド（GET /users/{id}）
	// 引数や戻り値は適宜修正してください
	@GetMapping( "/{id}" )
	public ResponseEntity<UserResponse> getUserById
	(
		@PathVariable int id
	)
	{
		User user = userService.findById( id ) ;

		UserResponse userResponse = new UserResponse( user ) ;

		return ResponseEntity.status( HttpStatus.OK ).body( userResponse ) ;
	}

	// クエリパラメータを使ったGETメソッド（GET /users/search）
	// 引数や戻り値は適宜修正してください
	@GetMapping( "/search" )
	public ResponseEntity<List<UserResponse>> searchUsers
	(
		@Valid @ModelAttribute UserSearchParam searchParam
		// @RequestParam( required = false ) String name,
		// @RequestParam( required = false ) String email
	)
	{
		User searchUser = new User( searchParam.getName(), searchParam.getEmail() ) ;
		// User searchUser = new User( name, email ) ;
		List<User> userList = userService.searchUsers( searchUser ) ;
		List<UserResponse> userResponses = new ArrayList<>() ;

		for ( User user : userList )
		{
			userResponses.add( new UserResponse(user) ) ;
		}

		return ResponseEntity.status( HttpStatus.OK ).body( userResponses ) ;
	}

	// POSTメソッドによるユーザー作成（POST /users）
	// 引数や戻り値は適宜修正してください
	@PostMapping( "" )
	public ResponseEntity<UserResponse> createUser
	(
		@Valid @RequestBody UserRequest userRequest
	)
	{
		User user = new User( userRequest.getName(), userRequest.getEmail() ) ;

		user = userService.createUser( user ) ;

		UserResponse userResponse = new UserResponse( user ) ;

		return ResponseEntity.status( HttpStatus.CREATED ).body( userResponse ) ;
	}

	// PUTメソッドによるユーザー更新（PUT /users/{id}）
	// 引数や戻り値は適宜修正してください
	@PutMapping( "/{id}" )
	public ResponseEntity<UserResponse> updateUser
	(
		@PathVariable int id,
		@Valid @RequestBody UserRequest userRequest
	)
	{
		User user = new User( userRequest.getName(), userRequest.getEmail() ) ;

		user = userService.updateUser( id, user ) ;

		UserResponse userResponse = new UserResponse( user ) ;

		return ResponseEntity.status(HttpStatus.OK).body( userResponse ) ;
	}

}
