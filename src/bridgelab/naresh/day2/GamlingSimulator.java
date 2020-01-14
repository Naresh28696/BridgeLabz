package bridgelab.naresh.day2;

import java.util.Random;
import java.util.Scanner;

public class GamlingSimulator {
	

	public static void main(String[] args) {
		//create the variable to take the input from user 
		int choice = 0;
		
		Scanner scan = new Scanner(System.in);

		
		do{
		System.out.println("Enter the beggining stake");
		
			
		int stake = scan.nextInt();
		while(stake < 1)
		{
			System.out.println("Hey you can't start empty handed!");
			System.out.println("Please enter an amount greater than 0");
			stake = scan.nextInt();
		}
		System.out.println("Enter you goal to be a millionare!");
		int goal = scan.nextInt();
		if(goal == stake) {
			System.out.println("You already reached your Goal.");
			return;
		}
		while( goal < stake)
		{
			System.out.println("Dear to be millionare, your here to win! So enter an amount greater than your stake!");
			goal = scan.nextInt();
		}
		simulator(stake, goal);
		System.out.println("press 1 for continue");
		choice = scan.nextInt();
		}while(choice == 1);

	}
	
	public static void simulator(int stake, int goal)
	{
		int win = 0;
		int loss = 0;
		float totalGambles = 0;
		int gamble = 0;
		Random random = new Random();
		do
		{
			gamble = random.nextInt(2);
			System.out.println(gamble);
			totalGambles++;
			if(gamble == 0)
			{
				stake++;
				System.out.println("Yay you won! You now have "+stake+". Your goal:"+goal);
				win++;
			}
			else
			{
				stake--;
				System.out.println("Bad luck!You lost! You now have "+stake+". Your goal:"+goal);
				loss++;
			}			
		}
		while(!(stake == 0 || stake == goal));

		System.out.println("You won "+win+" times");
		float winp = (win/totalGambles)*100;
		System.out.println("Win percent%"+winp);
		float lossp = (loss/totalGambles)*100;
		System.out.println("Loss percent%"+lossp);

	}
	
}
