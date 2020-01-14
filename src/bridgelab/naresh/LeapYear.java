package bridgelab.naresh;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Year : ");
		int year = scan.nextInt();
		boolean flag = false;
		
		if(year < 1582) {
			System.out.println("Year will accepted which is below from the 1582.");
			return;
		}else {
			
			if(year%4 == 0) {
				if(year%100 == 0) {
					if(year%400 == 0) {
						flag = true;
					}else {
						flag = false;
					}
				}else {
					flag = true;
				}
			}else {
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println(year + " Is leap Year.");
		}else {
			System.out.println(year + " Is not leap Year.");

		}
		
		
		
		
		
	}
}
