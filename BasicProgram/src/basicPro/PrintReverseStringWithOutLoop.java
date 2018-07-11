package basicPro;

public class PrintReverseStringWithOutLoop {

	public static void main(String[] args) {
		printNum(1);}

	private static void printNum(int i) {
		String str="Java";
		String str1=" ";
		if(i<=(str.length()-1)){
		str1=str1+str.charAt(i);
		System.out.println(str1);
		i++;
		printNum(i);
		}
		else{System.exit(0);}
	}
}

