package exercise1;
import java.util.Comparator;

/**
 * AgeComparator class that implements Comparator interface.
 * This class is used to compare two Student objects based on their age.
 */
public class AgeComparator implements Comparator<Student>
{
    @Override
    public int compare(Student s1, Student s2)
    {
        //First Compare students based on their age
        if (s1.getAge() != s2.getAge())
        {
            return Integer.compare(s1.getAge(), s2.getAge());
        }
        //If ages are equal, compare based on their names
        return s1.getName().compareTo(s2.getName());
    }
}
