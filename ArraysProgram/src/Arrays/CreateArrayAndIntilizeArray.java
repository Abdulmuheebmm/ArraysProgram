package Arrays;

public class CreateArrayAndIntilizeArray 
{
	public static void main(String[] args) 
	{
		int []a=new int[4];
		
		a[0]=10;			
		a[1]=20;			
		a[2]=30;			
		a[3]=40;			
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		//or by using for loop
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("by using for loop"+a[i]);
		}
	}
}
