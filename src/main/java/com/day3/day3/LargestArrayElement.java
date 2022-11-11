package com.day3.day3;

public class LargestArrayElement {

	public static void main(String[] args) {
		 int [] a = new int[] {20, 30, 40, 80, 50};
	        int largest = a[0];

	        for (int i=0; i<a.length; i++) {

	            if (a[i] > largest) {
	                largest = a[i];
	            }
	        }
	        System.out.println("Largest element in Array is: " + largest);
	}

}
