package basicPro;

import java.util.Scanner;

public class PrintNumberDivBy3and5 {
public static void main(String[] args) {
	int n=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	n=sc.nextInt();
	for(int i=0;i<=n;i++){
	if((i%3)==0)
	{
		if((i%5)==0)
		{
			System.out.println(i);
			}
		}
	}
}}

