package Arrays;

public class MaxDiffrenceInAnArray 
{
	public static void main(String[] args) 
	{
		int []a= {10,20,2,90,40};
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
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		int dif=max-min;
		System.out.println(dif);
	}
}
