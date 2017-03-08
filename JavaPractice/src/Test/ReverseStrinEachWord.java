package Test;

public class ReverseStrinEachWord {

	public static void main(String[] args) {


		String str[]="My name is sreenu".split("\\s");
		String rev="";
		for(int i=0;i<str.length;i++)
		{
			String word=str[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revword=revword+word.charAt(j);
			}
			
			rev=rev+revword+" ";
			
		}

		System.out.println(rev);
	}

}
