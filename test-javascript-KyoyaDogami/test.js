"use strict" ;

/* 1 */
console.log( "堂上響也" ) ;


/* 2 */
let firstName, lastName ;

firstName = "KYOYA" ;
lastName  = "DOGAMI" ;

console.log( firstName + " " + lastName ) ;


/* 3 */
const tax = 0.1 ;
let productA, productB, totalPrice, totalTax, total ;

productA = 200 ;
productB = 250 ;

total = ( productA * 3 ) + ( productB * 4 ) ;

totalTax = total * tax ;

totalPrice = total + totalTax ;

console.log( "小計" ) ;
console.log( total + "円" ) ;
console.log( "消費税" ) ;
console.log( totalTax + "円" ) ;
console.log( "合計" ) ;
console.log( totalPrice + "円" ) ;


/* 4 */
let testScore ;

testScore = 101 ;

if ( (testScore >= 0) && (testScore <= 79) )
{
	console.log( "追試です" ) ;
}
else if ( (testScore >= 80) && (testScore <= 100) )
{
	console.log( "合格です" ) ;
}
else
{
	console.log( "存在しない点数です" ) ;
}


/* 5 */
let i, out ;

out = 0 ;

for ( i = 1 ; i <= 100 ; i++ )
{
	out += i ;
}

console.log( out ) ;


/* 6 */

function add( a, b )
{
	return a + b ;
}

function sub( a, b )
{
	return a - b ;
}

function multi( a, b )
{
	return a * b ;
}

function div( a, b )
{
	return a / b ;
}

console.log( "5 + 3 = " + add(5, 3) ) ;
console.log( "5 - 3 = " + sub(5, 3) ) ;
console.log( "5 * 3 = " + multi(5, 3) ) ;
console.log( "5 / 3 = " + div(5, 3) ) ;
