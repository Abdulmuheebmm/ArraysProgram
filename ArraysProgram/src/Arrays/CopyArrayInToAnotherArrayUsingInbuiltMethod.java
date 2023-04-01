package Arrays;

import java.util.*;
public class CopyArrayInToAnotherArrayUsingInbuiltMethod 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8};
		int newa[]=Arrays.copyOf(a, a.length);
		
		for(int x:newa)
		{
			System.out.println(x);
		}
	}
}
