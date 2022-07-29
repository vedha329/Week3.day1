package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "life is good all is well";
		String[] strArray = text.split(" ");
		for(int i=0;i<strArray.length;i++)
		{
			System.out.println(strArray[i]);
		}
		
		//create an empty set
		Set<String> unique =new HashSet<String>();
		
		//Iterate the String array and add each word into Set
		for(int i=0;i<strArray.length;i++)
		{
			unique.add(strArray[i]);
		}
		//Print the Set values which is having unique words
		System.out.println(unique);
	
	}

}
