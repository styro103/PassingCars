/*
 * Shaun Mbateng
 * Passing Integers
 * This program counts the number of passing cars on the road.
 * 		(ReadMe has Full Description)
 * This program has an O(N) time complexity.
 */
import java.util.Scanner;

public class PassingIntegers 
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in); //For Inputting Integers
		
		int [] A; //Array of Values
		int len; //Length of Array
		int pairs; //Number of Cars Passing
		Tracker cars = new Tracker(); //New Instance of Car Tracker
		
		//Enter and Set Array Length
		System.out.print("Enter the Length of the Array: ");
		len = cin.nextInt();
		A = new int [len];
		
		//Fill Array
		for (int i=0; i<A.length; i++)
		{
			System.out.print("Enter Element "+(i+1)+": ");
			A[i] = cin.nextInt();
		}
		
		cin.close(); //Close cin, No Longer Needed
		pairs = cars.getPassers(A); //Get Number of Pairs Passing
		
		//Display Missing Element
		System.out.println("");
		System.out.println(pairs+" pair(s) of cars passing.");
	}
}