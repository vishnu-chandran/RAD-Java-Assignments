package wordoperation;

import java.util.Scanner;

public class wordcount {

	public static void main(String[] args) {
	/* Initialize count with 1 as if there are no spaces in the string, then there will be one word in the String.
		Check if you encounter any space.
		Once you find the space, check it next character. 
		If it is not space then we found a word in the String.Increment the count variable.
		Once you reach end of String, count variable will hold number of words in the String.  */
		String sentence;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input sentence: ");
		sentence=sc.nextLine();
		sc.close();
		int count=1;
		for(int i=0; i<sentence.length()-1; i++) {
			if((sentence.charAt(i)==' ')&& (sentence.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("number of words in the sentence :"+count);

	}

}
