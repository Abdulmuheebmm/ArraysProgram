package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyArrayToList
	{
		public static void main(String[] args) 
		{
			String []colors= {"red","purple","black","white"};
//			List li=Arrays.asList(colors);
//			System.out.println(li);
			List<String>l=new ArrayList<>();
//			Collections.addAll(l, colors);
//			System.out.println();
			for(String str:colors)
			{
				l.add(str);
			}
			System.out.println(l);
		}
	}
