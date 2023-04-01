package Arrays;

import java.util.Arrays;

public class MoveNonNegativeElementToStart 
{
	public static void main(String[] args) 
	{
		int []a= {1,2,5,8,3};
		int []b=new int[a.length-1];
		int val=3;
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==val)
			{
				b[j]=a[i+1];
				j++;
			}
			else
			{
				b[j++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));  
	}
}
