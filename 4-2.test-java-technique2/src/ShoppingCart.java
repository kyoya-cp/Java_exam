import java.util.LinkedList;

public class ShoppingCart extends LinkedList<Item>
{

	public int getTotalPrice()
	{
		int total ;

		total = 0 ;

		for ( Item item : this )
		{
			total += item.getPrice() ;
		}

		return ( total ) ;
	}

	public int getAveragePrice()
	{
		int rtn, total ;

		total = getTotalPrice() ;
		rtn = total / this.size() ;

		return ( rtn ) ;
	}
}
