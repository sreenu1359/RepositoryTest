package Test;

import java.util.HashMap;

public class CharOccurences {

	public static void main(String[] args) {


		String str="abcabdesesba";
		HashMap<Character,Integer> charcountmap=new HashMap<Character,Integer>();
		char[] arr=str.toCharArray();
		for(char c:arr)
		{
			if(charcountmap.containsKey(c))
			{
				charcountmap.put(c,charcountmap.get(c)+1);
			}
			else{
				charcountmap.put(c,1);
			}
		}
       System.out.println(charcountmap);
	}

}
