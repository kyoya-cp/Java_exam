"use strict" ;

$( function() {

	$( document )
	.ready( function() {
		/* 1 */
		console.log( "堂上響也" ) ;

		/* 5 */
		$( "#langSelect"       ).show() ;
		$( "#javaSelect"       ).hide() ;
		$( "#javascriptSelect" ).hide() ;
	} ) ;

	/* 2 */
	$( "#changeColorBtn" )
	.on( "click", function() {
		$( "#name" ).css( "color", "rgb(255, 0, 0)" ) ;
	} ) ;

	/* 3 */
	$( "#showAgeBtn" )
	.on( "click", function() {
		let age = $( "#ageInput" ).val() ;
		alert( age ) ;
	} ) ;

	/* 4 */
	$( "#dobbleClickSasenaiiYO" )
	.on( "click", function() {
		$( this ).prop( "disabled", true ) ;
	} ) ;

	/* 5 */
	$( "#langSelect" )
	.on( "change", function() {
		let choice = $( this ).val();

		if ( choice === "1" )
		{
			$( "#langSelect"       ).show() ;
			$( "#javaSelect"       ).show() ;
			$( "#javascriptSelect" ).hide() ;
		}
		else if ( choice === "2" )
		{
			$( "#langSelect"       ).show() ;
			$( "#javaSelect"       ).hide() ;
			$( "#javascriptSelect" ).show() ;
		}
		else
		{
			$( "#langSelect"       ).show() ;
			$( "#javaSelect"       ).hide() ;
			$( "#javascriptSelect" ).hide() ;
		}
	} ) ;

} ) ;
