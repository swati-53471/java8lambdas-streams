package epam.assignment.java8StreamsAndLambdaTa;

import java.util.*;
import java.util.stream.IntStream;

public class Task3 {
	
	static List<String> palindrome(List<String> list)
    {
        List<String> p =new ArrayList<String>();
           for(String i:list)
           {
               {String t = i.replaceAll("\\s+", "").toLowerCase();
               if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                   p.add(i);}
            }
            return p;
    }
	public static void main(String[] args) {
		        List<String> list=new ArrayList<String>();
		        list.add("madam");
		        list.add("road");
		        list.add("naman");
		        list.add("mom");
		        list.add("surf");
		        list.add("redivider");
		        list=palindrome(list);
		        
		        for(String i:list)
		            System.out.println(i);
		    }
		    
}
