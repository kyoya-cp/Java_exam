import java.util.ArrayList;
import java.util.List;

public class Exam3
{
	public static void main( String[] args )
	{
		String name ;
		Integer age ;
		List<Employee> list = new ArrayList<>() ;

		list.add( new Employee( "後藤", 31 ) ) ;
		list.add( new Employee( "山田", 28 ) ) ;
		list.add( new Employee( "佐藤", 25 ) ) ;
		list.add( new Employee( "田中", 19 ) ) ;

		for ( Employee emp : list )
		{
			name = emp.getName() ;
			age = emp.getAge() ;
			System.out.println( name + "(" + age + ")" ) ;
		}
	}
}
