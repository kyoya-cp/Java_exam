package exam1;

public class EcoCar extends Car
{
	public EcoCar( String name )
	{
		super( name ) ;
	}

	@Override
	void run()
	{
		String name ;

		name = super.getName() ;

		System.out.println( "シーン!" + name + "が走ります" ) ;
	}
}
