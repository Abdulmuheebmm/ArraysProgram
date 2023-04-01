package Arrays;

import java.util.Arrays;

public class MissngNumberInAnArray 
{
	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6};
		int  missing= getmissing( a,7);
		System.out.println("missing number is"+Arrays.toString(a)+missing);
	}
	
	static int getmissing(int []a,int n)
	{
		int actualsum=0;
		int expectedsum=(n*(n+1)/2);
		for(int i:a)
		{
			actualsum=actualsum+i;
		}
		return expectedsum-actualsum ;
	}
}
