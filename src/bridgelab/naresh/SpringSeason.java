package bridgelab.naresh;

public class SpringSeason {
	public static void main(String[] args) {
		String[] arg = { "3", "20", };

		int m = Integer.parseInt(arg[0]);
		int d = Integer.parseInt(arg[1]);

		if (m > 3 && m < 6) {
			System.out.println("Okay");
		} else if (m == 3 && d > 20) {
			System.out.println("Okay");
		} else if (m == 6 && d < 20) {
			System.out.println("Okay");
		} else {
			System.out.println("Not Okay");
		}

	}
}
