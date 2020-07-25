package epam.assignment.java8StreamsAndLambdaTa;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("abc");
		list.add("another");
		list.add("box");
		list.add("ant");
		list.add("pot");
		list.add("art");
		
		list
			.stream()
			.filter(x->x.startsWith("a"))
			.filter(x->x.length()==3)
			.forEach(System.out::println);
	}

}
