package basicPro;

public class SwapNumberWithOutThridVar {
public static void main(String[] args) {
	int a=10,b=20,c=0;
	/*//Method one 
 	a=a+b;System.out.println(a);
	b=a-b;System.out.println(b);
	a=a-b;System.out.println(a);*/
	
	//Method two
	b=(a+b)-(a=b);
	System.out.println("a="+a+"  "+"b="+b);
	}
}
