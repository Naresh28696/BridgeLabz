package bridgelab.naresh.day10;

public class PrimeAnagram {
	public static void main(String[] args) {
		String str = "";
		for (int i = 2; i <= 100; i++) {

			boolean flag = isPrime(i);

			if (flag) {
				str = str + i + " ";
			}
		}
		System.out.println(str);
		String[] ar = str.split(" ");
		int len = ar.length;
		String[] revStrArr = new String[len];
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(reverseStr(ar[i]) + " ");
			revStrArr[i] = reverseStr(ar[i]);
		}
		
		System.out.println();
		for(int i =0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(ar[i].equals(revStrArr[j])) {
					System.out.print(ar[i]+" ");
				}
			}
		}
			
		
		

	}

	private static String reverseStr(String str) {
		int len = str.length();
		String revStr = "";
		for (int i = len - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		return revStr;
	}

	private static boolean isPrime(int i) {
		boolean flag = true;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
				flag = false;
			}
		}
		return flag;
	}
}
