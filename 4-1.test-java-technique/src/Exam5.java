import java.time.LocalDate;

public class Exam5
{
	public static void main( String[] args )
	{
		int year, month, day ;
		LocalDate birth = LocalDate.of( 2001,5,12 ) ;

		year = birth.getYear() ;
		month = birth.getMonthValue() ;
		day = birth.getDayOfMonth() ;
		System.out.println( "私の誕生日は" + year + "年" + month + "月" + day + "日です" ) ;
	}
}
