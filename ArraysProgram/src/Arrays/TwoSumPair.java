package Arrays;

public class TwoSumPair 
{
	public static void main(String[] args) 
	{
		int []a= {10,20,40,30,50,0};
		int val=50;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]==val-a[i])
				{
					System.out.println(a[i]+" + "+a[j]+" = "+val);
				}
			}
		}
	}
}
