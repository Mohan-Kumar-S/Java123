package basicPro;

import java.util.Scanner;

public class fibonacciSeries {
public static void main(String[] args) {
	int a=0,b=1;
	int c,d;
	@SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number");
	c=s.nextInt();
	System.out.print(a+" "+b);
	for(int i=2;i<=c;i++){
	d=a+b;
	System.out.print(" "+d);
	a=b;
	b=d;
}
}
}