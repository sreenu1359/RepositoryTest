package Test;

public class ReverseEachWord {

	public static void main(String[] args) {


		String[] str="My name is sreenu".split("\\s");
		String rev="";
		for(int i=str.length-1;i>=0;i--)
		{
			rev=rev+str[i]+" ";
			
			
		}
      
		System.out.println(rev);
	}

}
