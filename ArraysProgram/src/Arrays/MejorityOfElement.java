package Arrays;
import java.util.*;
import java.util.Map.Entry;
public class MejorityOfElement 
{
	public static void main(String[] args) 
	{
		Map<Integer,Integer> mm=new HashMap<Integer,Integer>();
		int []a= {10,20,30,10,10,10};
		
		for(int i=0;i<a.length;i++)
		{
			mm.put(a[i], mm.getOrDefault(a[i], 0)+1);
		}
		
		for(Entry<Integer, Integer> entry:mm.entrySet())
		{
			if(entry.getValue()>a.length/2)
			{
				int result=entry.getKey();
				System.out.println(result);
			}
		}
	}
}
