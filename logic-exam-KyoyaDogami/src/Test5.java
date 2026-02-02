public class Test5
{
	public static void main( String[] args )
	{
		String[] sports = { "soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer", "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging", "baseball", "soccer", "soccer" } ;
		int soccerCnt, baseballCnt, joggingCnt, surfingCnt, boxingCnt ;

		soccerCnt = 0 ;
		baseballCnt = 0 ;
		joggingCnt = 0 ;
		surfingCnt = 0 ;
		boxingCnt = 0 ;

		for ( String s : sports )
		{
			if ( s.equals("soccer") )
			{
				soccerCnt++ ;
			}
			else if ( s.equals("baseball") )
			{
				baseballCnt++ ;
			}
			else if ( s.equals("jogging") )
			{
				joggingCnt++ ;
			}
			else if ( s.equals("surfing") )
			{
				surfingCnt++ ;
			}
			else if ( s.equals("boxing") )
			{
				boxingCnt++ ;
			}
			else
			{
				/* 処理なし */
			}
		}

		/*
  s b j s b
s - 1 1 1 1
b 1 - 1 1 1
j 1 1 - 1 1
s 1 1 1 - 1
b 1 1 1 1 -
		*/

		if ( (soccerCnt > baseballCnt) && (soccerCnt > joggingCnt) && (soccerCnt > surfingCnt) && (soccerCnt > boxingCnt) )
		{
			System.out.println( "最も出現回数の多いスポーツは soccer で、出現回数は" + soccerCnt + "回です" ) ;
		}
		else if ( (baseballCnt > joggingCnt) && (baseballCnt > surfingCnt) && (baseballCnt > boxingCnt) )
		{
			System.out.println( "最も出現回数の多いスポーツは baseball で、出現回数は" + baseballCnt + "回です" ) ;
		}
		else if ( (joggingCnt > surfingCnt) && (joggingCnt > boxingCnt) )
		{
			System.out.println( "最も出現回数の多いスポーツは jogging で、出現回数は" + joggingCnt + "回です" ) ;
		}
		else if ( surfingCnt > boxingCnt )
		{
			System.out.println( "最も出現回数の多いスポーツは surfing で、出現回数は" + surfingCnt + "回です" ) ;
		}
		else
		{
			System.out.println( "最も出現回数の多いスポーツは boxing で、出現回数は" + boxingCnt + "回です" ) ;
		}
	}
}
