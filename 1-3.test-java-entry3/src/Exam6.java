public class Exam6
{
	public static void main( String[] args )
	{
		int rslt ;

		/*	テスト用	*/
//		rslt = calc( 2, 3, '+' ) ;
//		rslt = calc( 8, 2, '-' ) ;
//		rslt = calc( 5, 4, '*' ) ;
//		rslt = calc( 7, 2, '/' ) ;
		rslt = calc( 3, 8, '@' ) ;

		System.out.println( rslt ) ;
	}

	public static int calc( int num1, int num2, char s )
	{
		int rtn ;

		if ( s == '+' )
		{
			rtn = num1 + num2 ;
		}
		else if ( s == '-' )
		{
			rtn = num1 - num2 ;
		}
		else if ( s == '*' )
		{
			rtn = num1 * num2 ;
		}
		else if ( s == '/' )
		{
			rtn = num1 / num2 ;
		}
		else
		{
			rtn = -1 ;
		}

		return ( rtn ) ;
	}
}
