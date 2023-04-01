package Arrays;

public class MaxAndMin 
{
	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,4,5,44};
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[min];
			}
		}
		
		System.out.println(max+"   "+min);
	}
}
