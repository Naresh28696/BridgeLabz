package bridgelab.naresh;

public class SumOfTwoDice {
	public static void main(String[] args) {
		int dise1 = (int)(Math.random()*6) + 1;
		int dise2 = (int)(Math.random()*6) + 1;
		int result = sumOfTwoDice(dise1,dise2);
		System.out.println("Sum of Two dices : " + result);
	}
	
	public static int sumOfTwoDice(int a,int b) {
		return a+b;
	}
}
