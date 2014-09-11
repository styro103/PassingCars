/*
 * The class and function to track pairs of passing cars.
 * This runs in O(N).
 */
class Tracker
{
	public int getPassers(int[] A) 
    {
		int passing = 0; //Integer to Hold Number of Cars Passing
        int zeros = 0; //Integer to Keep Count of Cars Going East
        int sum = 0; //Interger to Hold Sum of Array
        
        //Edge Case
        if (A.length<=1)
            return 0; //Only One Element Means No Passing
        
        //If Here, Then More Than One Element, Worth Traversing Through Array
        for (int i=0; i<A.length; i++) //Loop Through Array of Directions
        {
            sum += A[i]; //Update Sum
            
            if (A[i] == 0) //If Going East, Update Zero Count
                zeros++;
            else //If Going West, Car Will Pass All Cars Previous Cars Going East
            {
                passing += zeros; //Increment passing by Current Numbers of East Cars
                
                if (passing>1000000000) //Check If passing Exceeds Allowed Max
                    return -1; //Return -1 If So
                
              /*
               * With Given Edges of Problem, Zero Count Will be 100,000 at Max
               * Meaning passing Cannot Jump From Allowed Max to A Number Greater Than the Integer Max
               * So Value of passing Will Never Become Too Big and Turn Into Negative
               */
            }
                
        }
        
        //Another Edge Case
        if (sum==0 || sum==A.length) //If All Array Values are the Same
            return 0; //All the Same Values Means No Passing
        
        return passing; //Return Value
    }
}
