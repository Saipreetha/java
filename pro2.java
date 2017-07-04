package guvi;
import java.util.Scanner;
import java.util.Arrays;
public class pro2 {
	public static void main(String args[]){
		int num;
		System.out.print("Enter the number of elements in array");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		int arr[]=new int [num];
		System.out.print("Enter the elements in array");
		for(int i=0;i<num;i++){
			arr[i]=scan.nextInt();
		}
		scan.close();
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);	
		}
}
}