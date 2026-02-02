public class Test1
{
	public static void main( String[] args )
	{
		int i, j, calcData ;

		for ( i = 1 ; i <= 9 ; i++ )
		{
			for ( j = 1 ; j <= 9 ; j++ )
			{
				calcData = i * j ;

				if ( calcData <= 9 )
				{
					System.out.print( "0" + calcData + " " ) ;
				}
				else
				{
					System.out.print( calcData + " " ) ;
				}
			}
			System.out.println( "" ) ;
		}
	}
}
