package Test;

public class ReverseString {

	public static void main(String[] args) {


		String str="My name is sreenu";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			//System.out.print(rev);
		}
		System.out.println(rev);
	}

}
