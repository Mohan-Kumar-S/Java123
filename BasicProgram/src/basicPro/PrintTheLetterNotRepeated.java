package basicPro;

public class PrintTheLetterNotRepeated {

	public static void main(String[] args) {
		String s="java";
		int i,j,count=0;
		char[] ch=s.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.print(ch[j]);
					count++;
				}
			}
		}

	}

}
