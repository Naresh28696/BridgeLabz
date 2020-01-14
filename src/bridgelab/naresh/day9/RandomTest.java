package bridgelab.naresh.day9;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();
		for(int i =0;i<=30;i++) {
			System.out.println(random.nextInt(6)+1);
		}
		
	}
}
