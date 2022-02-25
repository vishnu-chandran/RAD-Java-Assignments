package wordoperation;

import java.util.Scanner;

public class wordCount {

	public static void main(String[] args) {
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
