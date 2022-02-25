package classOnes;

import java.util.Arrays;

public class ArrayElementswitch {

	public static void main(String[] args) {
		int array[]={1,2,3,4,5}; 
		System.out.println("The in put array is: "+ Arrays.toString(array));
		int newElement=22;
		int index=3 ;	
		int[] firstArray = Arrays.copyOfRange(array, 0, index); 
		
		int[] secondArray = Arrays.copyOfRange(array, index, array.length); 
		System.out.println(Arrays.toString(firstArray));
		System.out.println(Arrays.toString(secondArray));
		
		int newTemporary[] = new int[firstArray.length+secondArray.length+1];

		int j=0;
		for(int i=0;i<firstArray.length;i++) {
			newTemporary[i]=firstArray[i];
			j++;
			//
		}
		newTemporary[j]=newElement;
		j++;
		for(int i=0;i<secondArray.length;i++) {
			newTemporary[j]=secondArray[i];
			j++;
		}
		System.out.println("New array is: "+Arrays.toString(newTemporary));
	}
