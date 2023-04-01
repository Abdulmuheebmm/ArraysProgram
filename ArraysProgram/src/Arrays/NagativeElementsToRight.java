package Arrays;

public class NagativeElementsToRight 
{
	public static void main(String[] args) 
	{
		int arr[]= {-1,-20,30,40,50,-8};
		int newarr[]= new int[arr.length-1 ];
		rearrange(arr,newarr);
		print(newarr);
	}

	private static void print(int[] newarr) 
	{
		for(int i :newarr)
		{
			System.out.println(newarr[i]);
		}
	}

	private static void rearrange(int[] arr, int[] newarr)
	{
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				newarr[i]=arr[i];
				j++;
			}
		}
		
		for(int i=0;i<arr.length-11;i++)
		{
			if(arr[i]>0)
			{
				newarr[j]=arr[i];
				j++;
			}
		}
		print(newarr);
	}
}
