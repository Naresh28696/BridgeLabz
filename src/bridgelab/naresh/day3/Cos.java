package bridgelab.naresh.day3;

public class Cos {
	 public static void main(String[] args) { 
	        double x = 7; // Double.parseDouble(args[0]);

	        // convert x to an angle between -2 PI and 2 PI
	        x = x % (2 * Math.PI);

	        // compute the Taylor series approximation
	        double term = 1.0;      // ith term = x^i / i!
	        double sum  = 0.0;      // sum of first i terms in taylor series

//	        for (int i = 1; term != 0.0; i++) {
//	            term *= (x / i);
//	            if(i == 1) {
//	            	sum = 1 + term;
//	            }
//	            if (i % 4 != 2) sum += term;
//	            if (i % 4 != 3) sum -= term;
//	        }
//	        System.out.println(sum);
	        
	        for(int i=1;i <= 20;i++) {
//	        	if(i%4 == 0) {
//	        		System.out.println(i);
//	        	}
	        	if(i%2 == 0 && i%4 != 0) {
	        		System.out.println(i);
	        	}
	        }
	    }
}
