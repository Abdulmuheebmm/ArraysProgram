package Arrays;

public class FindTheFirstOccurance 
{
	public static void main(String[] args) 
	{
		int []a= {1,2,19,36,4,53,3};
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					flag=true;
					return;
				}				
			}
		}
		if(flag==false)
		{
			System.out.println("no duplicates");
		}
	}
}
