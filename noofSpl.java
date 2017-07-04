package guvi;
import java.util.Scanner;
public class noofSpl {
	public static void main(String[] args){
		System.out.println("Enter the line");
		Scanner scan=new Scanner(System.in);
		String line=scan.nextLine();
		int count=0;
		scan.close();
		for(int i=0;i<line.length();i++){
	   char ch= line.charAt(i);
	   if (Character.isUpperCase(ch)){  }
       else if (Character.isLowerCase(ch)){  }
       else if (Character.isDigit(ch)){ }
       else{
    	   count++;
       }
	}
		System.out.println(count);
}
}
