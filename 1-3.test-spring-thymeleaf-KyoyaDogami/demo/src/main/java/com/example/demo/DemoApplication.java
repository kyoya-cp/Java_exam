package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Springアプリケーション起動用クラス.
 * 
 * @author KyoyaDogami
 */
@SpringBootApplication
public class DemoApplication 
{
	/**
	 * Springアプリケーション起動する.
	 * 
	 * @param args
	 */
	public static void main( String[] args )
	{
		SpringApplication.run( DemoApplication.class, args ) ;
	}
}
