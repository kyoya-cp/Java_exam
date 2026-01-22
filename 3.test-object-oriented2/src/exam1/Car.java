package exam1;

public class Car
{
	private String name ;

	public Car( String name )
	{
		setName( name ) ;
	}

	void putOnGas()
	{
		System.out.println( getName() + "に給油します" ) ;
	}

	/*
	 *	以下、アクセラ群
	 */
	void run()
	{
		System.out.println( "ブーン!車が走ります" ) ;
	}

	public String getName()
	{
		return this.name ;
	}

	public void setName( String name )
	{
		this.name = name ;
	}
}
