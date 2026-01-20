public class Car
{
	int speed ;

	void run()
	{
		this.speed += 50 ;

		System.out.println( "走りました。スピードが" + this.speed + "km/hになりました。" ) ;

		if ( this.speed >= 120 )
		{
			System.out.println( "スピードの出しすぎです" ) ;
		}
	}
}
