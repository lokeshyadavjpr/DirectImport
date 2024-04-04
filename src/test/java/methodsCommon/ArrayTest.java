package methodsCommon;

import java.util.Arrays;

public class ArrayTest {
	
public static void main(String[] args) {
		
 
		
		findlargest();
 
		
	}
	
	public static void findlargest() {
		int[] yourData = {3, 1, 4, 1, 5, 9, 2, 6, 5};
	    Arrays.sort(yourData);
	    
	    for(int i:yourData) {
	    	System.out.print(i);
	    }
	    System.out.println("Test 1: "+(yourData.length));
	    
	    if (yourData.length >= 2) {
		  int secondLargest = yourData[yourData.length - 1];
		  System.out.println("Second largest element: " + secondLargest);
		} else {
		  System.out.println("Not enough elements to find second largest");
		}
		
	}

}
