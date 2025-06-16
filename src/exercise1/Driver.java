package exercise1;
import java.util.ArrayList;
import java.util.Collections;

public class Driver
{

	public static void main( String[] args )
	{
		ArrayList<Student> studs = new ArrayList<>();
		studs.add( new Student( "Smith", 34 ) );
		studs.add( new Student( "Johnson", 21 ) );
		studs.add( new Student( "Williams", 67 ) );
		studs.add( new Student( "Brown", 53 ) );
		studs.add( new Student( "Jones", 48 ) );
		studs.add( new Student( "Miller", 36 ) );
		studs.add( new Student( "Davis", 44 ) );
		studs.add( new Student( "Wilson", 52 ) );
		studs.add( new Student( "Anderson", 34 ) );
		studs.add( new Student( "Moore", 33 ) );

		//Display original list
		System.out.println("Original List:");
		System.out.println(studs);

		//Sort by name using Comparable
		Collections.sort(studs);
		System.out.println("\nSorted by name:");
		System.out.println(studs);

		//Sort by age (then by name if ages match) using Comparator
		Collections.sort(studs, new AgeComparator());
		System.out.println("\nSorted by age (then name if ages match):");
		System.out.println(studs);
	}

}
