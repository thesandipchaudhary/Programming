// Array in ascending order
import java.util.Scanner;
public class arrayascend {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
		System.out.println("Enter the Array Limit :");
		int l =input.nextInt();
		int [] arr =new int[l];
		for(int i=0;i<l;i++)
		{
			System.out.println("Element of array arr[%d]:"+arr[i]);
			arr[i]=input.nextInt();
		}

        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                  int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.println(arr[i] + " ");    
        }    
    }
}

