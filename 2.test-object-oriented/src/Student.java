public class Student
{
	int energy ;

	public Student( int energy )
	{
		this.energy = energy ;
	}

	void sleep()
	{
		boolean power ;

		if ( this.energy == 100 )							/* this.energy: 初回から100のパターン考慮 */
		{
			power = true ;
		}
		else
		{
			power = false ;
		}

		this.energy += 50 ;

		if ( this.energy >= 100 )
		{
			this.energy = 100 ;
			power = true ;									/* this.energy: 70 -> 100のパターン考慮 */
		}

		System.out.println( "寝ました。エネルギーが" + this.energy + "になりました。" ) ;

		if ( power == true )
		{
			System.out.println( "フルパワー!" ) ;
		}
	}

	void study()
	{
		boolean power ;

		if ( this.energy == 0 )								/* this.energy: 初回から0のパターン考慮 */
		{
			power = true ;
		}
		else
		{
			power = false ;
		}

		this.energy -= 30 ;

		if ( this.energy <= 0 )
		{
			this.energy = 0 ;
			power = true ;									/* this.energy: 30 -> 0のパターン考慮 */
		}

		System.out.println( "勉強しました。エネルギーが" + this.energy + "になりました。" ) ;

		if ( power == true )
		{
			System.out.println( "寝てください。" ) ;
		}
	}
}
