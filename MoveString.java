
 /*
<<<<<<<<<The program to move string as input is "abcdxdxdxdx" the out put willbe abcddddxxxx >>>>>>>>>

*/


import java.util.Scanner;

public class MoveString{
public static String str="";
public static int count=0;
	public static void move(String s,int idx,char c){
		if(idx == s.length()){
			for(int i=0;i<count;i++){
				str+= c;
			}
			System.out.println("The new String is :"+str);
			return ;
			}
		char currentChar=s.charAt(idx);
		if( currentChar == c){
			count++;
			move(s,idx+1,c);
		}else{
			str=str+currentChar;
			move(s,idx+1,c);

		}

	}

	public static  void main(String[] args){
	String str="axbxcxdefxxh";
	move(str,0,'x');
	}
}

/* Time complexity O(n+n)
n for string length
n for count
Time complexity= O(n+n) => O(2n)	=>remove constant value ~ O(n) n=length of string
*/
