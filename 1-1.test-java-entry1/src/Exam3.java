public class Exam3
{
	public static void main( String[] args )
	{
		final double TAX = 0.1 ;
		int productA, productB ;
		int productPrice, taxPrice, totalPrice ;

		productA = 200 ;
		productB = 250 ;

		productPrice = ( productA * 3 ) + ( productB * 4 ) ;
		taxPrice = (int)( productPrice * TAX ) ;
		totalPrice = productPrice + taxPrice ;

		System.out.println( "小計" ) ;
		System.out.println( productPrice ) ;
		System.out.println( "消費税" ) ;
		System.out.println( taxPrice ) ;
		System.out.println( "合計金額" ) ;
		System.out.println( totalPrice ) ;
	}
}
