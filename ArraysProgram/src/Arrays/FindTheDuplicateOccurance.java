package Arrays;

public class FindTheDuplicateOccurance 
{
	public static void main(String[] args) 
	{
		Integer []a= {1,2,3,1,2,7};
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicates :="+a[i]);
					flag=true;
					return;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("no duplicats");
		}
	}
}
