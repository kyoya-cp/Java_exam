import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class Exam6
{
	public static void main( String[] args )
	{
		LocalDateTime tokugawa = LocalDateTime.of( 1543, 2, 10, 05, 12 ) ;
		System.out.println( "徳川家康の誕生日は" + tokugawa + "です" ) ;

		tokugawa = tokugawa.plusYears( 1 ) ;
		tokugawa = tokugawa.plusMonths( 2 ) ;
		tokugawa = tokugawa.plusDays( 3 ) ;
		tokugawa = tokugawa.plusHours( 4 ) ;
		tokugawa = tokugawa.plusMinutes( 5 ) ;
		System.out.println( "1年2ヶ月3日4時間5分後は" + tokugawa + "です" ) ;
	}
}
