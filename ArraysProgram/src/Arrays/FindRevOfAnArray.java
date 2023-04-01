package Arrays;
import java.util.*;
public class FindRevOfAnArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the "+(i+1+"st element"));
			a[i]=sc.nextInt();
		}
		int []rev=new int[size];
		int k=0;
		for(int i=a.length-1;i>=0;i--)
		{
			rev[k++]=a[i];
		}
		
		System.out.println(Arrays.toString(rev));;
	}
}
