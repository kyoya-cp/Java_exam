package exam1;

public class SuperCar extends Car
{
	public SuperCar( String name )
	{
		super( name ) ;
	}

	@Override
	void run()
	{
		String name ;

		name = super.getName() ;

		System.out.println( "ブオーン!" + name + "が走ります" ) ;
	}
}
