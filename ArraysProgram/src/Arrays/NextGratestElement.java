package Arrays;

public class NextGratestElement 
{
	public static void main(String[] args) 
	{
	
		int a[]= {11,21,13,14};
		next(a);
	}

	private static void next(int[] a) {
		// TODO Auto-generated method stub
		int temp=-1,i,j;
		for( i=0;i<a.length;i++)
		{
			 temp=-1;
			for( j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
				}
			}
		}
		System.out.println(temp);
	
	}
}
