package Arrays;

import java.util.*;

public class DuplicateInAnArray 
{
	public static void main(String[] args) 
	{
		int []a= {10,20,20,40,40};
		bruteForce(a);
		extra(a);
	}

	private static void extra(int[] a) {
		Set<Integer>set=new HashSet<>();
		
		
	}

	private static void bruteForce(int[] a) 
	{
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}	
	}
}
