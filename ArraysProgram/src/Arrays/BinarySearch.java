package Arrays;
import java.util.*;
public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int li=0;
		int hi=a.length-1;
		int mid=(li+hi)/2;
		int val=4;
		boolean flag=false;
		while(li<=hi)
		{
			if(a[mid]==val)
			{
				System.out.println("iteam present"+val+" "+mid);
				flag=true;
				break;
			}
			else if(a[mid]<val)
			{
				li=mid+1;
			}
			else 
			{
				hi=mid-1;
			}
			mid=(li+hi)/2;
		}
		if(flag==false)
		{
			System.out.println(-1);
		}
	}
}
