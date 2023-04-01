package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeleteAnElementFromAnArray 
{
	public static void main(String[] args) 
	{
		Integer []a= {1,2,3,4,6};
		System.out.println("Original Array ="+Arrays.toString(a));
		int pos=4;
		int []newarry=IntStream.range(0,a.length).filter(i->i!=pos).map(i->a[i]).toArray();
		System.out.println("Deletion of  Array ="+Arrays.toString(newarry));
		
	}
}
