package bridgelab.naresh.day3;

public class RepeatedTwice {
	void printRepeating(int arr[])  
    { 
        int i, j, len=arr.length; 
        System.out.println("Repeated Elements are :"); 
        for (i = 0; i < len; i++)  
        { 
            for (j = i + 1; j < len; j++)  
            { 
                if (arr[i] == arr[j])  
                    System.out.print(arr[i] + " "); 
            } 
        } 
    } 
  
    public static void main(String[] args)  
    { 
    	RepeatedTwice repeat = new RepeatedTwice();
    	int size = 100;
    	int arr[] = new int[size];
    	while(size-- > 1) {
    		arr[size] = size;
    	}
    	arr[0] = 97;
        repeat.printRepeating(arr); 
    } 
}
