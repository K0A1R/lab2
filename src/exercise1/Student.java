package exercise1;

/**
 * Student class that implements Comparable interface.
 * This class is used to represent a student with a name and age.
 * It can be sorted based on the natural ordering defined in the compareTo method.
 */
public class Student implements Comparable<Student>
{
	private String name;
	private int age;
	
	//Parameterized constructor to initialize name and age
	public Student( String name, int age )
	{
		this.name = name;
		this.age = age;
	}

	// Getter for name
	public String getName()
	{
		return name;
	}
	// Getter for age
	public int getAge()
	{
		return age;
	}

	// compareTo method to compare students based on their names alphabetically
	@Override
	public int compareTo(Student other)
	{
		return this.name.compareTo(other.name); 
	}

	// toString method to return a string representation of the student
	@Override
	public String toString()
	{
		return name + " (" + age + " years" + ")";
	}
}
