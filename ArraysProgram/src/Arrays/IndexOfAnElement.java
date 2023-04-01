package Arrays;

public class IndexOfAnElement 
{
	public static void main(String[] args) 
	{
		 String []a= {"red","pink","blue"};
		 int index=0;
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]=="blue")
			 {
				 index=i;
			 }
		 }
		 System.out.println(index);
	}
}
