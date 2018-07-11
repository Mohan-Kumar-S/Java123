package basicPro;

import java.util.Scanner;

public class Palindrom {
public static void main(String[] args) {
	int temp=0, rev=0, n=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number");
	n=s.nextInt();
	temp=n;
	while(n>0)
	{
	int d=n%10;
	rev=(rev*10)+d;
	n=n/10;
	}
	if(temp==rev)
		System.out.println("Palindrom");
		else

			System.out.println("not pal");
	}}

