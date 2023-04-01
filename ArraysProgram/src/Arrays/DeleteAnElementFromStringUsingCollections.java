package Arrays;
import java.util.*;

public class DeleteAnElementFromStringUsingCollections 
{
	public static void main(String[] args) 
	{
		String []str= {"red","green","blue"};
		List<String>sl=new ArrayList(Arrays.asList(str));
		sl.remove(2);
		sl.remove("red");
		System.out.println(sl);
	}
}
