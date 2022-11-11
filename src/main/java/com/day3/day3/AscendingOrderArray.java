package com.day3.day3;

import java.util.Scanner;

public class AscendingOrderArray {

	public static void main(String[] args) {
		int arr[] = new int[5];
        int temp;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Elements in Array: ");

        for (int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i=0; i<arr.length; i++) {

            for (int j=i+1; j<arr.length; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sort Ascending order Elements:");

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        scan.close();
	}

}
