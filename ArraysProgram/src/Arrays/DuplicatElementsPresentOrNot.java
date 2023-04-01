package Arrays;
import java.util.*;
public class DuplicatElementsPresentOrNot 
{
	public static void main(String[] args) 
	{
		int []a= {10,20,40,20};
		boolean flag=false;
		Set <Integer> se=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			if(se.contains(a[i]))
			{
				System.out.println("duplicates are= "+a[i]);
				flag=true;
			}
			else
			{
				se.add(a[i]);
			}
		}
		if(flag==false)
		{
			System.out.println("no duplicates are present");
		}
		
		
	}
}
