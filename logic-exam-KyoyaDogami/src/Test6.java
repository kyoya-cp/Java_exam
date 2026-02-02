public class Test6
{
	public static void main( String[] args )
	{
		int[] num = new int[3] ;
		String s1, s2, s3 ;

		num[0] = (int)( Math.floor( Math.random() * 10 ) ) ;
		num[1] = (int)( Math.floor( Math.random() * 10 ) ) ;
		num[2] = (int)( Math.floor( Math.random() * 10 ) ) ;

		s1 = String.valueOf( num[0] ) ;
		s2 = String.valueOf( num[1] ) ;
		s3 = String.valueOf( num[2] ) ;

		System.out.println( s1 + s2 + s3 ) ;
		System.out.println( s1 + s3 + s2 ) ;
		System.out.println( s2 + s1 + s3 ) ;
		System.out.println( s2 + s3 + s1 ) ;
		System.out.println( s3 + s1 + s2 ) ;
		System.out.println( s3 + s2 + s1 ) ;
	}
}
