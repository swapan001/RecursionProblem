
 /*
<<<<<<<<<The program to create keypad combination of  string.  >>>>>>>>>

*/


import java.util.Scanner;

public class KeypadCombination{
	public static String keypad []={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

	public static void printComb(String str,int idx,String combStr){
		
		if(idx==str.length()){
			System.out.println(combStr);
			return;
		}
		char currChar=str.charAt(idx);
		String mapping=keypad[currChar-'0'];
		for(int i=0;i<mapping.length();i++){
			printComb(str,idx+1,combStr+mapping.charAt(i));
			
			}
				
	}

	public static  void main(String[] args){
	String str="22";
	
	printComb(str,0,"");
	}
}

/*
Time complexity= O(2^n+1) => O(2^n)	
*/



