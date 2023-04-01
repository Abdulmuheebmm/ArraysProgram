package Arrays;

import java.util.*;

public class SumOfElementsInAnArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the "+(i+1+"st element"));
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}
}
