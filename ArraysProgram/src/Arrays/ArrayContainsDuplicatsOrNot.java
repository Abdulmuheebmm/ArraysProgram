package Arrays;

import java.util.*;

/*
1:create and intialize input array
2:convert the array to list
3:creat an hashset using list
4:if the list and size are not equal then we can say array contains duplicates  
*/

public class ArrayContainsDuplicatsOrNot 
{
	public static void main(String[] args) 
	{
		String []a= {"java","oracale","c","java"};
		List ll=Arrays.asList(a);//java,oracle,c,java
		Set dup=new HashSet(ll);//java,oracle,c
		if(ll.size()!=dup.size())
		{
			System.out.println("the array contains duplicats ");
		}
		else
		{
			System.out.println("the arary dosent contains dupli");
		}
		
	}
}
