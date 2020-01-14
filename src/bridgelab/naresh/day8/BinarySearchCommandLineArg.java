package bridgelab.naresh.day8;

public class BinarySearchCommandLineArg {
	public static boolean binarySearch(int[] arr, int l, int r, int x) {
		while (l <= r) {
			int mid = (l + r) / 2;
			
			if(x > arr[mid] ) {
				l = mid+1;
			}
			if(x < arr[mid]) {
				r = mid-1;
			}
			if(arr[mid] == x) {
				return true;
			}
		}	
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,7,8,9};
		int len = arr.length - 1;
		int l = 0;
		
		System.out.println(binarySearch(arr,l,len,-1));
	}
}
