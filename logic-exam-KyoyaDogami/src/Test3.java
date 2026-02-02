public class Test3
{
	public static void main( String[] args )
	{
		String inputYear ;
		int year, outYear ;
		int calcRslt1, calcRslt2 ;

		inputYear = args[0] ;

		year = Integer.parseInt( inputYear ) ;

		calcRslt1 = year / 100 ;
		calcRslt2 = year % 100 ;

		if ( calcRslt2 == 0 )
		{
			outYear = calcRslt1 ;

			System.out.println( year + "年は" + outYear + "世紀です" ) ;
		}
		else
		{
			outYear = calcRslt1 + 1 ;

			System.out.println( year + "年は" + outYear + "世紀です" ) ;
		}
	}
}
