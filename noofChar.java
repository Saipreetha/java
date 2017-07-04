package guvi;
import java.util.Scanner;
public class noofChar {
	public static void main(String[] args){
		System.out.println("Enter the line");
		Scanner scan=new Scanner(System.in);
		String line=scan.nextLine();
		int count=0;
		scan.close();
		for(int i=0;i<line.length();i++){
			if(line.charAt(i)==' '){
				
			}
			else{
				count++;	
			}
		}
		System.out.println(count);
	}

}
