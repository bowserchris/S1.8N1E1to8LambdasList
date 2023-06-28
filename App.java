package n1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		//////Ejercicio 1////// return list with only 'o'
		System.out.println("Exercise 1:");
		List<String> list = new ArrayList<>();
				
		list.add("hello");
		list.add("ohoh");
		list.add("this");
		list.add("cant");
		list.add("be");
		list.add("able");
		list.add("to");
		list.add("function");
		list.add("correctly");
		list.add("can");
		list.add("it?");
		
		List<String> listWithO = new ArrayList<>();
		listWithO.addAll(list);
		
		listWithO.removeIf(string -> !string.contains("o"));
	
		System.out.println(list);
		System.out.println(listWithO);
		
		
		//////Ejercicio 2////// list with 'o' & <5 letters
		System.out.println("");
		System.out.println("Exercise 2:");
		listWithO.removeIf(string -> string.length() <= 5);
		System.out.println(listWithO);
		
		
		//////Ejercicio 3////// list with months & print thru lambda
		System.out.println("");
		System.out.println("Exercise 3:");
		List<String> listMonth = new ArrayList<>();
		listMonth.add("January");
		listMonth.add("February");
		listMonth.add("March");
		listMonth.add("April");
		listMonth.add("May");
		listMonth.add("June");
		listMonth.add("July");
		listMonth.add("August");
		listMonth.add("September");
		listMonth.add("October");
		listMonth.add("November");
		listMonth.add("December");
		
		listMonth.forEach( month -> { System.out.print(month + " "); } );
		System.out.println("");
		
		//////Ejercicio 4////// list with months & print thru method reference
		System.out.println("");
		System.out.println("Exercise 4:");
		listMonth.forEach(System.out::println);
		
		//////Ejercicio 5////// create custom interface, instantiate & print result
		System.out.println("");
		System.out.println("Exercise 5:");
		PiValue value = (n) -> n;
		System.out.println(value.getPiValue(3.1415));
		
		//////Ejercicio 6////// sort from shortest to longest
		System.out.println("");
		System.out.println("Exercise 6:");
		List<String> listWithNums = new ArrayList<>();
		listWithNums.add("12esrt45");
		listWithNums.add("hi123");
		listWithNums.add("supercadrefrajalisticexpialadoshis");
		listWithNums.add("24");
		listWithNums.add("was12up2bab4");
		listWithNums.sort(Comparator.comparingInt(s -> s.length()));
		System.out.println(listWithNums);
		
		//////Ejercicio 7////// exercise 6 but in reverse order, longest to shortest. casting was very important here
		System.out.println("");
		System.out.println("Exercise 7:");
		Collections.sort(listWithNums, Comparator.comparingInt((String s) -> s.length()).reversed());
		System.out.println(listWithNums);

		//////Ejercicio 8//////
		System.out.println("");
		System.out.println("Exercise 8:");
		Reverse reverse = (str) -> {   // lambda expression
			String result = "";
			for(int i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println(reverse.reverse("hello"));
	}
	
}

/*


- Exercise 8

    Create a Functional Interface that contains a method called reverse(). 
    This method must receive and must return a String. In the main() of the
     main class, it injects into the interface created using a lambda, the 
     body of the method, so that it returns the same string that it receives
      as a parameter but in reverse. It invokes the interface instance by passing
       it a string and checks if the result is correct.
 */

