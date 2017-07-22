package GUVI;
import java.util.Scanner;
public class Pr61 {
	public static void main(String[] main){
		System.out.println("Enter the input 1&2");
		Scanner scan=new Scanner(System.in);
		String input1=scan.nextLine();
		String input2=scan.nextLine();
		char ch[]=input1.toCharArray();
		char ch2[]=input2.toCharArray();
		for(int i=0;i<input1.length();i++){
			char d=(char)(ch[i]+10);
			System.out.print(d);
		}
		System.out.print(" ");
		System.out.print(input2.charAt(0));
		for(int i=1;i<input2.length()-1;i++){
			char d=(char)(ch2[i]+10);
			if(d>=97&&d<=122){
				System.out.print(d);	
			}
			else{
				char e=(char)(ch2[i]-16);
			    System.out.print(e);	
			}
		}
		System.out.print(input2.charAt(input2.length()-1));
		scan.close();
	}

}
