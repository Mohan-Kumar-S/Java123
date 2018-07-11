package basicPro;

import java.util.Scanner;

public class PrintEvenOddWithOutArithmetic {
public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number");
	n=s.nextInt();
	if((n&1)==0)//if((n|1)==0) for even
		System.out.println("Even");
	else
		System.out.println("old");
}
}