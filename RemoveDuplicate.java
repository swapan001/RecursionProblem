
 /*
<<<<<<<<<The program to remove duplicate string. If input is "abbccda" the out put willbe abcd >>>>>>>>>
a-a=0;
b-a=1;
c-a=2;
d-a=3;
*/


import java.util.Scanner;

public class RemoveDuplicate{
	public static boolean map[]=new boolean[26];

	public static void removeDuplicates(String str,int idx,String newStr){
		
		if(idx==str.length()){
			System.out.println(newStr);
			return;
		}
		char currChar=str.charAt(idx);
		if(map[currChar-'a']==true){
			removeDuplicates(str,idx+1,newStr);
			}
		else{
			newStr+=currChar;
			map[currChar-'a']=true;
			removeDuplicates(str,idx+1,newStr);
			}
				
	}

	public static  void main(String[] args){
	String str="axbbxccxddeefxxh";
	removeDuplicates(str,0,"");
	}
}

/* Time complexity O(n+n)
n for string length
n for count
Time complexity= O(n+n) => O(2n)	=>remove constant value ~ O(n) n=length of string
*/



