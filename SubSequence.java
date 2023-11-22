
 /*
<<<<<<<<<The program to create subsequence of a string. If input is "abc" the out put willbe abc ab ac a bc b c  _ >>>>>>>>>

*/


import java.util.Scanner;

public class SubSequence{

	public static void subSeq(String str,int idx,String newStr){
		
		if(idx==str.length()){
			System.out.println(newStr);
			return;
		}
		char currChar=str.charAt(idx);
		//when to be added
		subSeq(str,idx+1,newStr+currChar);
		//when not to be Added
		subSeq(str,idx+1,newStr);
				
	}

	public static  void main(String[] args){
	String str="abcd";
	
	subSeq(str,0,"");
	}
}

/*
Time complexity= O(2^n+1) => O(2^n)	
*/



