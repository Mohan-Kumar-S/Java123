package basicPro;

public class StringWithOutLengthMethod {

	public static void main(String[] args) {
		String str="Dude";int count=0;
		char[] ch=str.toCharArray();		//Using Foreach method
		for(int i=1;i<=ch.length;i++){		//for(char c:str.toCharArray()){
			 count++;						//	i++;}
		}								//
		System.out.println(count);//using length method System.out.println(str.lenght());
	}

}
