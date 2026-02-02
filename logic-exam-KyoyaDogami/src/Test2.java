public class Test2
{
	public static void main( String[] args )
	{
		String inputHour, inputMinutes, inputSeconds ;
		int hour, minutes, seconds ;
		int updateHour, updateMinutes, updateSeconds ;

		inputHour = args[0] ;
		inputMinutes = args[1] ;
		inputSeconds = args[2] ;

		hour = Integer.parseInt( inputHour ) ;
		minutes = Integer.parseInt( inputMinutes ) ;
		seconds = Integer.parseInt( inputSeconds ) ;

		updateHour = hour ;
		updateMinutes = minutes ;
		updateSeconds = seconds + 1 ;

		if ( updateSeconds >= 60 )
		{
			updateSeconds = 0 ;
			updateMinutes = minutes + 1 ;

			if ( updateMinutes >= 60 )
			{
				updateMinutes = 0 ;
				updateHour = hour + 1 ;

				if ( updateHour >= 24 )
				{
					updateHour = 0 ;
				}
			}
		}

		System.out.println( hour + "時" + minutes + "分" + seconds + "秒の1秒後は" + updateHour + "時" + updateMinutes + "分" + updateSeconds + "秒です" ) ;
	}
}
