package guvi;
import java.util.Scanner;
import java.util.Arrays;
public class pro1 {
	public static void main(String[] args){
      System.out.println("Enter the number");
      Scanner scan=new Scanner(System.in);
      int num=scan.nextInt();
      System.out.println("Enter the digits to be deleted");
      int del=scan.nextInt();
      String num2=Integer.toString(num);
      char ch[]=num2.toCharArray();
      Arrays.sort(ch);
      scan.close();
      char ch1[]=new char[ch.length-del];
      for(int i=0;i<ch.length-del;i++){
          ch1[i]=ch[i];    	
      	}
      num=Integer.parseInt(new String(ch1));
      System.out.print(num);
   }
  }