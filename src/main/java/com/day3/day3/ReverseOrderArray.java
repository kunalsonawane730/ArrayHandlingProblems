package com.day3.day3;

public class ReverseOrderArray {

	public static void main(String[] args) {
		
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array in reverse order is:");
        for (int i=arr.length-1; i>=0; i--) {
            System.out.println(arr[i]);
        }
	}

}
