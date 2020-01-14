package bridgelab.naresh.day8;

import java.util.Scanner;

public class bubbleSort {
	public static void bubbleSort(int[] arr) {
		int len = arr.length - 1;
		
		for(int i =0;i<=len;i++) {
			for(int j=0;j<=len-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void printArr(int[] arr) {
		int len = arr.length -1;
		for(int i=0;i<=len;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number Of Elements : ");
		int num = scan.nextInt();
		int[] arr2 = new int[num];
		for(int i=0;i<num;i++) {
			System.out.print("["+i+"] = " );
			arr2[i] = scan.nextInt();
		}
		printArr(arr2);
		System.out.println();
		bubbleSort(arr2);
		printArr(arr2);
	}
}
