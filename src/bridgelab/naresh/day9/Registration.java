package bridgelab.naresh.day9;

import java.util.Scanner;

public class Registration {
	
	public static boolean checkFlname(String name) {
		return name.matches("^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}");
	}
	public static boolean checkEmail(String email) {
		return email.matches("^(.+)@(.+)$");
	}
	public static boolean checkMonumber(String mono) {
		return mono.matches("(0/91)?[7-9][0-9]{9}");
	}
	public static boolean checkID(String id) {
		return id.matches("^[a-zA-Z0-9]+$");
	}
	public static boolean checkPassword(String password) {
		return password.matches("^[a-zA-Z0-9]+$");
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String flname = null;
		int count = 0;
		do {
			if(count > 0) {
				System.out.println("\t Enter The Valid Name and last Name");
			}
			System.out.print("Enter Name and LastName :");
			flname = scan.nextLine();
			count++;
		}while(!checkFlname(flname));
		
		String email = null;
		count = 0;
		do {
			if(count > 0) {
				System.out.println("\t Enter The Valid Email");
			}
			System.out.print("Enter Email :");
			email = scan.nextLine();
			count++;
		}while(!checkEmail(email));
		
		String monumber = null;
		count = 0;
		do {
			if(count > 0) {
				System.out.println("\t Enter The Valid Mobile Number");
			}
			System.out.print("Enter Mobile Number :");
			monumber = scan.nextLine();
			count++;
		}while(!checkMonumber(monumber));
		
		

		System.out.print("Enter address :");
		String addresh = scan.nextLine();
		
		
		String id = null;
		count = 0;
		do {
			if(count > 0) {
				System.out.println("\t Enter The Valid ID");
			}
			System.out.print("Enter ID :");
			id = scan.nextLine();
			count++;
		}while(!checkMonumber(id));
		
		String password = null;
		count = 0;
		do {
			if(count > 0) {
				System.out.println("\t Enter The Strong Password");
			}
			System.out.print("Enter Password :");
			password = scan.nextLine();
			count++;
		}while(!checkPassword(password));
		
		
	}
}
