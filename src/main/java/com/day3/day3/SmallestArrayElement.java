package com.day3.day3;

public class SmallestArrayElement {

	public static void main(String[] args) {
		int a[] = new int[] {30, 40, 10, 20, 90};
        int smallest = a[0];

        for (int i=0; i<a.length; i++) {

            if (a[i] < smallest) {
                smallest = a[i];
            }
        }
        System.out.println("Smallest element in Array is: " + smallest);
	}

}
