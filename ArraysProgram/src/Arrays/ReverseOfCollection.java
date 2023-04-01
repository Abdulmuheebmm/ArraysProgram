package Arrays;
import java.util.*;

/*
 1:create collection object and add elements to it 
 2:pass the collection to Collection.reverse()methos
 */
public class ReverseOfCollection 
{
	public static void main(String[] args) 
	{
		List l1=new ArrayList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		Collections.reverse(l1);
		System.out.println(l1);
	}
}
