package com.day3.day3;

public class DuplicateArrayElements {

	public static void main(String[] args) {
		int[] inputArray = {2, 1, 4, 5, 1, 2, 3, 3, 6};
		System.out.println("Duplicate Elements Found:");
		 	for (int i=0; i<inputArray.length; i++) {

            for (int j=i+1; j<inputArray.length; j++) {

                if (inputArray[i] == inputArray[j]) {

                System.out.println(inputArray[i]);
               }
	}

}
}
}