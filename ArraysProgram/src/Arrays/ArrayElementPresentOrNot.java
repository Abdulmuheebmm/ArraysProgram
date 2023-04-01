package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayElementPresentOrNot 
{
	public static void main(String[] args) 
	{
		Integer []a= {1,2,3,5,4,6,3};
		Integer []b= {8,1,4,9};
		Integer []c= {1,5,10,15,3};
		
		HashSet <Integer> h= new HashSet<>();
		List<Integer>l1=Arrays.asList(a);
		List<Integer>l2=Arrays.asList(b);
		List<Integer>l3=Arrays.asList(c);
		h.addAll(l1);
		h.addAll(l2);
		h.addAll(l3);
		List <Integer> finallist=new ArrayList<Integer>();
		
		for(Integer num:h)
		{
			if(l1.contains(num)&&(l2.contains(num))||
			   l2.contains(num)&&(l3.contains(num))||
		       l3.contains(num)&&(l1.contains(num)))
			{
				finallist.add(num);
			}
		}
		
		System.out.println(finallist);
		
	}
}
