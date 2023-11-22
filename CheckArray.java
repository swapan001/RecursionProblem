 /*
<<<<<<<<<The program to check an given array is sorted or not(Strictly increasing) >>>>>>>>>
the array like 1 2 3 4 5 6 7  9   
*/


import java.util.Scanner;

public class CheckArray{
	public static boolean isSorted(int a[],int idx){
		if(idx == a.length-1){
			return true;
			}
		if(a[idx]<a[idx+1]){
			return isSorted(a,idx+1);	// I use here idx++ and fall in infinite loop
		}else{return false;}
		
		
	
	}
	
	public static  void main(String[] args){
	
	int arr[]={1,2,3,5};
	int arr1[]={1,2,2,3};
	
	boolean t=isSorted(arr,0);
	if (t==true){
		System.out.println("The array is Sorted");
		}
	else{
		System.out.println("The array is unSorted");
	}
		
	boolean f=isSorted(arr1,0);
		if (f == true ){
		System.out.println("The array is Sorted");
		}
		else{
		System.out.println("The array is unSorted");
		}	
	
	
//	System.out.println(isSorted(arr,0));
	}
}

/* Time complexity O(n) n=length of array */
