import java.util.Scanner;
class OccuranceInString{
	public static int first=-1;
	public static int last=-1;	//static means it not change

	public static void Occurance(String str,int idx,char element){
		
		if(idx==str.length()){
			System.out.println("First occurence at index : "+first);	
			System.out.println("Last occarence st index : "+last);
			return;
		}
		char currentChar=str.charAt(idx);
		if(currentChar==element){
			if(first==-1){
				first=idx;
			}else{
				last=idx;
				}
		}
		Occurance(str,idx+1,element);
	
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s=sc.nextLine();
		System.out.print("\nEnter the  occarence char: ");
		String ch=sc.nextLine();
		char c=ch.charAt(0);
		Occurance(s,0,c);
	}
}


/* Time complexity = O(n)  here n is the length of String*/
