package bridgelab.naresh.day3;

import java.util.Scanner;

public class RollDie {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The roalling number of Die : ");
		int n = scan.nextInt();
		int[] resultDice = new int[n];
		
		for(int i=0;i<n;i++) {
			resultDice[i] = rollResult();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(resultDice[i]);
		}
		
		System.out.println("Dice maximum number of times.");
		int mostRepeated = maxRepetedNum(resultDice);
		System.out.println(mostRepeated);
		
	}
	
	public static int rollResult() {
		return (int) (Math.random()*6) + 1;
	}
	
	
	
	public static int maxRepetedNum(int[] resultDice) {
		int[] arr = resultDice;
		int len = arr.length;
		int max = arr[0], result = 0; 
		
		for (int i = 0; i< len; i++) 
            arr[(arr[i]%len)] += len; 
		
//		System.out.println("After arr[");
//		for(int i=0;i<len;i++) {
//			System.out.println(arr[i]);
//		}
		
	    for (int i = 1; i < len; i++) 
	    { 
	        if (arr[i] > max) 
	        { 
	            max = arr[i]; 
	            result = i; 
	        } 
	    }
	   
	    return result;
	}
}
