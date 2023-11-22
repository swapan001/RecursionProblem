/*	print  reverse of a String using Recursion	*/

import java.util.Scanner;
public class ReverseString{
	public static void Rev(String str,int idx){
		if(idx==0){
			System.out.print(str.charAt(idx));
			return;
			}
		System.out.print(str.charAt(idx));
		Rev(str,idx-1);
		}
	public static void main(String[] args){
		System.out.print("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int idx=s.length()-1;
		System.out.print("\nThe reverse string is : ");
		Rev(s,idx);
		System.out.println();
		}
	}

/* Time complexity of this program in worst case is O(n)   ||> n is the length of string*/

