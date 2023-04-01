package Arrays;

import java.util.HashSet;
import java.util.*;

public class DuplicatElementInAnArray 
{
	public static void main(String[] args) 
	{
		String dup[]= {"java","spring","hyber","java"};
		Set nonDuplicateSet=new HashSet();
		Set DuplicateSet=new HashSet();
		for(String s:dup)
		{
			if(! nonDuplicateSet.contains(s))
			{
				 nonDuplicateSet.add(s);
			}
			else
			{
				DuplicateSet.add(s);
			}
		}
		System.out.println(DuplicateSet);
		System.out.println(nonDuplicateSet);
	}
}
