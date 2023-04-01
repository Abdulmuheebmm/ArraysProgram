package Arrays;
import java.util.*;
public class FindSecondHigestElementInAnArray 
{
	public static void main(String[] args) 
	{
		int []a= {1,3,4,12,42,22,234};
		Arrays.sort(a);
		System.out.println("second higest :"+a[a.length-2]);
		System.out.println("first higest :"+a[a.length-1]);
	}
}
