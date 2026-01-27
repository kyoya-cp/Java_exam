public class Main5
{
	public static void main( String[] args )
	{
		int total, ave ;
		ShoppingCart shoppingCart = new ShoppingCart() ;
		Item item1 = new Item( "アナと雪の女王", 3000 ) ;
		Item item2 = new Item( "美女と野獣", 2000 ) ;
		Item item3 = new Item( "モアナと伝説の海", 8000 ) ;

		total = shoppingCart.getTotalPrice() ;
		ave = shoppingCart.getAveragePrice() ;

		System.out.println( "合計値:" + total ) ;
		System.out.println( "平均値:" + ave );
	}
}
