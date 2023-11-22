import java.util.Scanner;
public class permutationString{
	public static void printPerm(String str,String perm){
		if(str.length()==0){
			System.out.println(perm);
			return;
			}
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			String newStr=str.substring(0,i)+str.substring(i+1);
			System.out.println(str.substring(0,i)+"<__>");
			System.out.println(str.substring(i+1)+"<__(-__-)___>");
			printPerm(newStr,perm+c);
		}
	}
	public static void main(String [] args){
		System.out.print("Enter the String: (ABC) :");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		printPerm(s,"");
	}
}
