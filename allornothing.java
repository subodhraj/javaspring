package snitsoft;

import java.util.Random;

public class allornothing {
	
	
	    // use a constant rather than having the "magic number" 10000 scattered about
	    public static final int N = 10000;

	    public static void main(String[] args)
	    {
	        //array to store N random integers (0 - N-1)
	        int[] nums = new int[N];

	        // initialize each value at index i to the value i 
	        for (int i = 0; i < nums.length; ++i)
	        {
	            nums[i] = i;
	        }

	        Random randomGenerator = new Random();
	        int randomIndex; // the randomly selected index each time through the loop
	        int randomValue; // the value at nums[randomIndex] each time through the loop

	        // randomize order of values
	        for(int i = 0; i < nums.length; ++i)
	        {
	             // select a random index
	             randomIndex = randomGenerator.nextInt(nums.length);

	             // swap values
	             randomValue = nums[randomIndex];
	             nums[randomIndex] = nums[i];
	             nums[i] = randomValue;
	        }
	    }


}
