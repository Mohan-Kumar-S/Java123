package basicPro;

import java.util.Scanner;

public class FactorialUsingRecursion {
	static int n;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int n=sc.nextInt();
	FactorialUsingRecursion(1);
	}
private static void FactorialUsingRecursion(int num){
	int fact=1;
	 if(num<=n){
		 fact=fact*num;
		 num=num++;
		 FactorialUsingRecursion(num);
		}
System.out.println(fact);
}
}
