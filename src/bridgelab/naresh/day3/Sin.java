package bridgelab.naresh.day3;
import java.util.*;
public class Sin {

    public static void main(String[] args) { 
        double x = 7; // Double.parseDouble(args[0]);

        // convert x to an angle between -2 PI and 2 PI
//        x = x % (2 * Math.PI);

        // compute the Taylor series approximation
//        double term = 1.0;      // ith term = x^i / i!
//        double sum  = 0.0;      // sum of first i terms in taylor series
        
        int expFact = 2;//the exponent & factorial term
		double negationFactor = 1.0;// used to alternate between addition and subtraction of terms
		double powerSeries = 0.0;//accumulator for power series
		double factorialResult = 0.0;//result of the factorial
		
        while (factorialResult < Double.POSITIVE_INFINITY) {
//            term *= (x / i);
            factorialResult = factorial(expFact);
            powerSeries = 1 +(negationFactor * (Math.pow(x, expFact))/factorialResult);
            negationFactor *= -1.0;// the negation factor alternates + - + - +.....
			
			expFact +=2;//increment 
        }
        System.out.println(x - powerSeries);
    }
    
    private static double factorial(int x) {
		double f = (double) x;
		for (int i= x-1; i>0; i--)
		{
		f = f*(double)i;
		}
		return f;
	}
}
