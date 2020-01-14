package bridgelab.naresh.day8;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
	
	
	 public static void sort(Comparable[] a) {
	        int n = a.length;
	        for (int i = 1; i < n; i++) {
	            for (int j = i; j > 0; j--) {
	                if (a[j-1].compareTo(a[j]) > 0) {
	                    exch(a, j-1, j);
	                }
	                else break;
	            }
	        }
	    }
	 
	 private static void exch(Comparable[] a, int i, int j) {
	        Comparable swap = a[i];
	        a[i] = a[j];
	        a[j] = swap;
	    }
  
    /* A utility function to print array of size n*/
    static void printArray(String arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    }
    
    static void countFreq(String arr[], int n)  
    { 
        Map<String, Integer> mp = new HashMap<>(); 
  
        // Traverse through array elements and  
        // count frequencies  
        for (int i = 0; i < n; i++) 
        { 
            mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1); 
        } 
  
        // To print elements according to first  
        // occurrence, traverse array one more time  
        // print frequencies of elements and mark  
        // frequencies as -1 so that same element  
        // is not printed multiple times.  
        for (int i = 0; i < n; i++)  
        { 
            if (mp.get(arr[i]) != -1)  
            { 
                System.out.println(arr[i] + " " + mp.get(arr[i])); 
                mp.put(arr[i], -1); 
            } 
        } 
    } 
  
  
    // Driver method 
    public static void main(String args[]) 
    { 
        String arr[] = { "Naresh","Amit","Dinesh","Dinesh" }; 
        
        sort(arr);
        printArray(arr); 
        int len = arr.length;
        countFreq(arr, len);
    } 
}

