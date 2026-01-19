public class Exam5
{
	public static void main( String[] args )
	{
		int addRslt, subRslt, mulRslt, divRslt, remainRslt ;
		int num1, num2 ;

		num1 = 5 ;
		num2 = 3 ;

		addRslt = addition( num1, num2 ) ;
		subRslt = subtraction( num1, num2 ) ;
		mulRslt = multiplication( num1, num2 ) ;
		divRslt = division( num1, num2 ) ;
		remainRslt = remainder( num1, num2 ) ;

		System.out.println( "足し算結果:" + addRslt ) ;
		System.out.println( "引き算結果:" + subRslt ) ;
		System.out.println( "掛け算結果:" + mulRslt ) ;
		System.out.println( "割り算結果:" + divRslt ) ;
		System.out.println( "剰余算結果:" + remainRslt ) ;
	}

	public static int addition( int num1, int num2 )
	{
		int rslt ;

		rslt = num1 + num2 ;

		return ( rslt ) ;
	}

	public static int subtraction( int num1, int num2 )
	{
		int rslt ;

		rslt = num1 - num2 ;

		return ( rslt ) ;
	}

	public static int multiplication( int num1, int num2 )
	{
		int rslt ;

		rslt = num1 * num2 ;

		return ( rslt ) ;
	}

	public static int division( int num1, int num2 )
	{
		int rslt ;

		rslt = num1 / num2 ;

		return ( rslt ) ;
	}

	public static int remainder( int num1, int num2 )
	{
		int rslt ;

		rslt = num1 % num2 ;

		return ( rslt ) ;
	}
}
