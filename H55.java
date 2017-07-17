package hunter;
import java.util.Scanner;
public class H55 {
  public static void main(String[] args){
	  System.out.println("Enter the array size");
	  Scanner scan=new Scanner(System.in);
	  int num=scan.nextInt();
	  System.out.println("Enter the array");
	  int arr[]=new int[num];
	  for(int i=0;i<num;i++){
	  	arr[i]=scan.nextInt();
	  }
	  System.out.println("Enter the number to rotate");
	  int rot=scan.nextInt(); 
	  scan.close();
	  for(int i=rot;i<num;i++){
		  System.out.print(arr[i]+" ");
	  }
	  for(int i=0;i<rot;i++){
		  System.out.print(arr[i]+" ");
	  }
  }
}
