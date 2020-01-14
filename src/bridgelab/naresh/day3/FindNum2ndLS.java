package bridgelab.naresh.day3;

public class FindNum2ndLS {
	public static void main(String[] args) {
		int[] arr = {12, 13,14, 1, 10, 9, 1};
		int len = arr.length;
		
		int firstSmll, secondSmll, firstLgst, secondLgst;
		firstSmll = secondSmll = Integer.MAX_VALUE;
		firstLgst = secondLgst = Integer.MIN_VALUE;
		
		for (int i = 0; i < len ; i ++) 
        { 
            /* If current element is smaller than first 
              then update both first and second */
            if (arr[i] < firstSmll) 
            { 
            	secondSmll = firstSmll; 
                firstSmll = arr[i]; 
            } else if (arr[i] < secondSmll && arr[i] != firstSmll) {
            	secondSmll = arr[i]; 
            }
            	
            
            
            if (arr[i] > firstLgst) 
            { 
            	secondLgst = firstLgst; 
            	firstLgst = arr[i]; 
            } else if (arr[i] > secondLgst && arr[i] != firstLgst) {
            	secondLgst = arr[i]; 
            }
  
            /* If arr[i] is in between first and second 
               then update second  */
            
        }
		
		if (secondSmll == Integer.MAX_VALUE) 
            System.out.println("There is no second" + 
                               "smallest element"); 
        else
            System.out.println("second Smallest element is " + secondSmll); 
		
		if (secondLgst == Integer.MIN_VALUE) 
            System.out.print("There is no second largest"+ 
                                " element\n"); 
       else
            System.out.print("Second Largest element is " + secondLgst);
		
		
	}
}
