public class Exam6
{
	public static void main( String[] args )
	{
		int i, j, val ;

		val = 0 ;

		for ( i = 1 ; i <= 9 ; i++ )
		{
			for ( j = 1 ; j <= 9 ; j++ )
			{
				val = i * j ;

				if ( val < 10 )								/* 値10未満は半角スペース入れる		*/
				{
					System.err.print( " " + val ) ;
				}
				else
				{
					System.out.print( val );
				}

				System.err.print( " " ) ;
			}

			System.out.println( "" ) ;
		}
	}
}
