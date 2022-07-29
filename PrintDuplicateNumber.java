package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumber {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,2,1};
		
		Set<Integer> unique = new HashSet<Integer>();
		
		for(int i =0; i<data.length;i++)
		{
			boolean add = unique.add(data[i]);
			if(!add)
			{
				System.out.println(data[i]);
			}
		}

	}

}
