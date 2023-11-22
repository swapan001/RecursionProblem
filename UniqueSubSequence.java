
 /*
<<<<<<<<<The program to create unique subsequence of a string. >>>>>>>>>

*/

import java.util.HashSet;
import java.util.Scanner;

public class UniqueSubSequence{

	public static void subSeq(String str,int idx,String newStr,HashSet<String> set){
		
		if(idx==str.length()){
			if(set.contains(newStr)){
				return;
			}else{
				set.add(newStr);	
				System.out.println(newStr);
				return;
			}
		}
		char currChar=str.charAt(idx);
		//when to be added
		subSeq(str,idx+1,newStr+currChar,set);
		//when not to be Added
		subSeq(str,idx+1,newStr,set);
				
	}

	public static  void main(String[] args){
//	String str="abcd";
	String str="aaa";
	HashSet<String> set=new HashSet<>();
	subSeq(str,0,"",set);
	}
}

/* Time complexity */



