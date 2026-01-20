public class Exam4
{
	public static void main( String[] args )
	{
		int addRslt, subRslt, multiRslt, divRslt, remainRslt ;
		int num1, num2 ;

		num1 = 5 ;
		num2 = 3 ;

		addRslt = Calculation.addition( num1, num2 ) ;
		subRslt = Calculation.subtraction( num1, num2 ) ;
		multiRslt = Calculation.multiplication( num1, num2 ) ;
		divRslt = Calculation.division( num1, num2 ) ;
		remainRslt = Calculation.remainder( num1, num2 ) ;

		System.out.println( "足し算結果:" + addRslt ) ;
		System.out.println( "引き算結果:" + subRslt ) ;
		System.out.println( "掛け算結果:" + multiRslt ) ;
		System.out.println( "割り算結果:" + divRslt ) ;
		System.out.println( "剰余算結果:" + remainRslt ) ;
	}
}
