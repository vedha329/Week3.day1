package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestnum {
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};

	
Set<Integer> temp = new TreeSet<Integer>();
for(int i=0;i<data.length;i++)
{
	temp.add(data[i]);
}
System.out.println(temp);
List<Integer> secondList = new ArrayList<Integer>(temp);
int size = secondList.size();
System.out.println(size);
System.out.println(secondList.get(size-2));
}
}