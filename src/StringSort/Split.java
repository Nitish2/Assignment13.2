package StringSort;
/**
 * As mention in question . 
 * “ My name is XYZ ” splits into  " My, name, is, XYZ " & sort the characters of each word.
 * Here we are splitting and sorting the whole string by putting string into the array.
 **/

// NOTE:- We split or sort a normal string , we can only sort or split an array.
import java.util.Arrays;

public class Split { // Creating Class
	protected String str = "My name is nitish negi"; // Initializing Global string variable
														

	public static void main(String[] args) { // Main Class
		Split s1 = new Split(); // Creating class Object for global variable str . 
		
		String[] words = s1.str.split(" "); /**Split function to separate the whole string 
		                                    and put it into the string array . 
											**/
		System.out.println("String after spliting into words:");
		
		for (String w : words) {  /** For loop to initialize the length of the string array .
									**/ 
			System.out.print(w + ",");  // Printing the string after splitting 
		}

		Split s2 = new Split();   //Creating class object for calling method 
		s2.sortString();      // Calling method 

	}

	void sortString() {  // creating method 

		
		System.out.println("\n\nSorting characters of each word:");
		String[] c = str.split(" ");  // Splits the string again 
		
		for (int i = 0; i < c.length; i++) {
	        char[] ch = c[i].toCharArray(); // Initializing the character array length 
		    Arrays.sort(ch);  // Sorting the character array in ascending order 
			System.out.print(ch); // Printed the sorted array 
            
		}
	}
}
