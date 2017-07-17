package pro;
import java.util.*;
import java.util.Scanner;
public class pro21 {
	public static void main(String[] args){
System.out.println("Enter the array size");
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
System.out.println("Enter the array");
int arr[]=new int[num];
for(int i=0;i<num;i++){
	arr[i]=scan.nextInt();
}
int sum=0;
int sum2=0;
int count=0;
int count2=0;
ArrayList<Integer> al=new ArrayList<Integer>();
ArrayList<Integer> al2=new ArrayList<Integer>();
for(int i=0;i<num/2;i++){
    sum=sum+arr[i];
    count++;
    al.add(arr[i]);
}
for(int i=num/2;i<num;i++){
	sum2=sum2+arr[i];
	count2++;
	al2.add(arr[i]);
	
}
if((sum/count)==(sum2/count2)){
	System.out.println(al+","+al2);
}
else{
	System.out.println("Not Possible");
}
scan.close();
}
}
