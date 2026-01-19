public class Exam3
{
	public static void main( String[] args )
	{
		int cnt ;

		cnt = 3 ;

		viewName( cnt ) ;
	}

	public static void viewName( int count )
	{
		int i ;
		String name ;

		name = "堂上響也" ;

		for ( i = 0 ; i < count ; i++ )
		{
			System.out.println( name ) ;
		}
	}
}
