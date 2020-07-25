package epam.assignment.java8StreamsAndLambdaTa;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Task1 {

	public static void main(String[] args) {
		
		IntStream stream=IntStream.of(34,56,78,90,48,40,56,60,80,25);
		OptionalDouble avg=stream.average();
		
		if(avg.isPresent())
		{
			System.out.println(avg.getAsDouble());
		}
		else
		{
			System.out.println(-1);
		}
	}

}
