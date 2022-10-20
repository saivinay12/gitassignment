package question_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strings = Arrays.asList("abcdef", "", "bc", "efghi", "abcd","", "jklnop");
		System.out.println(strings);
		int c1=0,c2=0;
		for(String string: strings) {
			if(string.length()>5)
				c1++;
			if(string.isEmpty())
				c2++;
		}
		System.out.println("Number of strings having size more than 5 is: "+c1);
		System.out.println("Number of empty strings is: "+c2);
		List<String> filtered = deleteEmptyStrings(strings);
		System.out.println(filtered);
}
	static List<String> deleteEmptyStrings(List<String> strings) {
		List<String> filteredList = new ArrayList<String>();
		for(String string: strings) {
			if(!string.isEmpty()) {
				filteredList.add(string);
	    	}
		}
			return filteredList;


	}

}
