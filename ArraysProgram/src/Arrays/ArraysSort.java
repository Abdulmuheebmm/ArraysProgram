package Arrays;
import java.util.*;
public class ArraysSort 
{
	public static void main(String[] args) 
	{
		String []str= {"bbb","aaaa","cccc","dddd"};
		System.out.println("before sorting\n");
		for(String s:str)
		{
			System.out.println(s);
		}
		//sorting using inbuilt method
		System.out.println("\nAFTER SORTING TJE ELEMENTS\n");
		Arrays.sort(str);
		for(String x:str)
		{
			System.out.println(x);
		}
		
		Arrays.sort(str,Collections.reverseOrder());
		System.out.println("sorting in decending order");
		for(String s:str)
		{
			System.out.println(s);
		}
		
	}
}
