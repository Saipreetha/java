package guvi;
import java.util.Scanner;
public class noofWord {
	public static void main(String[] args){
		System.out.println("Enter the line");
		Scanner scan=new Scanner(System.in);
		String line=scan.nextLine();
		int count=1;
		scan.close();
		for(int i=0;i<line.length();i++){
			if(line.charAt(i)==' '){
				count++;
			}
		}
		System.out.println(count);
	}

}
