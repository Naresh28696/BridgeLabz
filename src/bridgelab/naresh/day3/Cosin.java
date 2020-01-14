package bridgelab.naresh.day3;

import java.util.*;
public class Cosine{
	l;
	public static void main(String[] args){
		int degrees = 6;
		Scanner myScanner = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter some integer value of degrees (-1 to quit)");
			degrees = myScanner.nextInt();
			if (degrees == -1)
			{
				break;
			}
			System.out.println("\nCosine calculation for "+ degrees +" degrees using...");
			System.out.println("      ...Power Series: "+ myCos(degrees * Math.PI/180));// convert degrees to radians
			System.out.println("        ...Math class: "+ Math.cos(degrees * Math.PI/180));//check result vs Math class
		}
		System.out.println("Have a nice day!");
	}
	
	private static double myCos(double radians) {
		int expFact = 2;//the exponent & factorial term
		double negationFactor = 1.0;// used to alternate between addition and subtraction of terms
		double powerSeries = 0.0;//accumulator for power series
		double factorialResult = 0.0;//result of the factorial
		
		while (factorialResult < Double.POSITIVE_INFINITY) {// stop when factorialResult overflow is reached
			
			factorialResult = factorial(expFact);// calculate the factorial
			
			powerSeries = 1 +(negationFactor * (Math.pow(radians, expFact))/factorialResult);// the next statement calculates power series
			
			negationFactor *= -1.0;// the negation factor alternates + - + - +.....
			
			expFact +=2;//increment exponent and factorial term by two
		}
		return radians - powerSeries;//subtraction, as specified in the formula
	}
	//calculates the factorial
	private static double factorial(int x) {
		double f = (double) x;
		for (int i= x-1; i>0; i--)
		{
		f = f*(double)i;
		}
		return f;
	}
		
}
