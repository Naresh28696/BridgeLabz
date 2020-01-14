package bridgelab.naresh.day10;

import java.util.ArrayList;

public class Array2DPrime {
	public static void main(String[] args) {
		
		allocateSlot();
	}

	private static void allocateSlot() {
		int begineSlot = 1;
		int endSlot = 100;
		int[][] sloats = new int[10][];
		int countPrimePerSloat = 0;
		int m = 0, n=0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=2;i<=1000;i++) {
			
			
			boolean flag = isPrime(i);
			
			if(flag) {
				if((i >= begineSlot) && (i <= endSlot)) {
//					System.out.print(i+" ");
					list.add(i);
//					sloats[m][n] = i;
//					System.out.println(" m n = "+sloats[m][n]);
//					countPrimePerSloat++;
				}
			}
			
			if(i%100 == 0) {
				begineSlot += 100;
				endSlot += 100; 
//				System.out.println(" total elements : "+countPrimePerSloat);
//				System.out.println();
				countPrimePerSloat = 0;
				m =m+1;
				n = 0;
			}
		}
		
		list.forEach(i -> System.out.println(i));
	}

	private static boolean isPrime(int i) {
		boolean flag = true;
		for(int j=2;j<=i/2;j++) {
			if(i%j == 0) {
				flag = false;
			}
		}
		return flag;
	}
}
