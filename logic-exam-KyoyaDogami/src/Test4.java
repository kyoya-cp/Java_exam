public class Test4
{
	public static void main( String[] args )
	{
		String inputYear ;
		int year ;
		boolean rtn ;

		inputYear = args[0] ;

		year = Integer.parseInt( inputYear ) ;

		rtn = judgeYear( year ) ;

		if ( rtn == true )
		{
			System.out.println( year + "はうるう年です" ) ;
		}
		else
		{
			System.out.println( year + "はうるう年ではありません" ) ;
		}
	}

	public static boolean judgeYear( int year )
	{
		int calcRslt1, calcRslt2, calcRslt3 ;
		boolean rtn ;

		rtn = false ;
		calcRslt1 = year % 4 ;
		calcRslt2 = year % 100 ;
		calcRslt3 = year % 400 ;

		if ( calcRslt1 == 0 )
		{
			if ( calcRslt2 == 0 )
			{
				if ( calcRslt3 == 0 )
				{
					rtn = true ;
					return ( rtn ) ;
				}

				return ( rtn ) ;
			}

			rtn = true ;
			return ( rtn ) ;
		}

		/** 全抜け対処 */
		return ( rtn ) ;
	}
}
