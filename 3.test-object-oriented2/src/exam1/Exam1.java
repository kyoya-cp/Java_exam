package exam1;

public class Exam1
{
	public static void main( String[] args )
	{
		Car[] cars = new Car[2] ;
		cars[0] = new SuperCar( "フェラーリ" ) ;
		cars[1] = new EcoCar( "プリウス" ) ;

		for ( Car car : cars )
		{
			car.putOnGas() ;
			car.run() ;
		}
	}
}
