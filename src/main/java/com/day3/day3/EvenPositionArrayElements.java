package com.day3.day3;

public class EvenPositionArrayElements {

	public static void main(String[] args) {
		int arr[] = new int[] {1, 2, 3, 4, 5};
        System.out.println("Elements of array present on even position are:");

        for (int i=1; i<arr.length; i=i+2) {
            System.out.println(arr[i]);
        }
	}

}
