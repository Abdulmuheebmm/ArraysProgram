package Arrays;

public class ReaptingElementsInAnArray 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,3,2,4,5};
		int temp[]=new int[a.length];
		
		for(int i=0;i<temp.length;i++)
		{ 
			int x=a[i];
			if(temp[x]==1)
			{
				System.out.println(a[i]);
			}
			else
			{
				temp[x]=temp[x]+1;
			}
		}
	}
}
