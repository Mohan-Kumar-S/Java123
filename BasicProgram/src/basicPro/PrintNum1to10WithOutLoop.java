package basicPro;

import java.util.Scanner;

public class PrintNum1to10WithOutLoop {
	static int num;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	num=sc.nextInt();
	printNum(1);
	}
	private static void printNum(int i) {	
	if(i<=num){
	System.out.println(i);
	i++;
	printNum(i);
	}}
	}
	
