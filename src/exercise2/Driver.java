package exercise2;

import java.util.Random;

public class Driver
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 10;

	public static int binarySearch( Integer[] listOfInts, int target )
	{
		int low = 0;
		int high = listOfInts.length - 1;

		while( low <= high )
		{
			int mid = ( low + high ) / 2;
			if( listOfInts[mid] == target )
			{
				return mid;
			}
			else if( listOfInts[mid] < target )
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}

		return -1; // target not found
	}

	public static void main( String[] args )
	{

		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();
		int randnum = rand.nextInt( UPPER_BOUND );
		nums[0] = randnum;
		System.out.println( nums[0] ); // added this because the first element is not generated in the loop

		for( int i = 1; i < SIZE; i++ )
		{
			randnum = rand.nextInt( UPPER_BOUND );
			nums[i] = nums[i - 1] + randnum;
			System.out.println( nums[i] );
		}

		int target = 5;
		System.out.println( "Searching for '" + target + "'." );
		int result = binarySearch( nums, target );
		if( result != -1 )
		{
			System.out.println( "Found at index: " + result );
		}
		else
		{
			System.out.println( "Not found." );
		}

	}

}
