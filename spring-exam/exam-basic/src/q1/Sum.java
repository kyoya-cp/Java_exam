package q1;

/**
 * Q1. 1から10までの数値を足しあわせ、コンソールに出力しなさい。
 *
 * @author y.morinaga
 */
public class Sum
{
	public static void main( String[] args )
	{
		int i, calcRslt ;

		calcRslt = 0 ;
	
		for ( i = 1 ; i <= 10 ; i++ )
		{
			calcRslt += i ;
		}

		System.out.println( "計算結果:" + calcRslt ) ;
	}
}
