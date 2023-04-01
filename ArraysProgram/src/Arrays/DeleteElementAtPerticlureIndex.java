package Arrays;

public class DeleteElementAtPerticlureIndex 
{
	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6};
		int []b=new int[a.length-1];
		int pos=2;
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(i==pos)
			{
				continue;
			}
			b[k++]=a[i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
