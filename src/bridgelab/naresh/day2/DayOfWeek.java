package bridgelab.naresh.day2;

public class DayOfWeek { 

	   
	    public static int day(int month, int day, int year) {
	        int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        return d;
	    }

	    
	    public static boolean isLeapYear(int year) {
	        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
	        if  (year % 400 == 0) return true;
	        return false;
	    }

	    public static void main(String[] args) {
	        int month =2;// Integer.parseInt(args[0]);    // month (Jan = 1, Dec = 12)
	        int year = 2012;//Integer.parseInt(args[1]);     // year

	        

	        // days[i] = number of days in month i
	        int[] days = {
	            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	        };

	        // check for leap year
	        if (month == 2 && isLeapYear(year)) days[month] = 29;

	        // starting day
	        int d = day(month, 4, year);
	        System.out.println("Day : "+d);

	        

	    }
	}
