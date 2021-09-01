package com.integer.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzImpl {

	public void fizzBuzzFunction(int[] fizzBuzzArray) {
		
		/**
		 * 1.If the number is multiple of 3 , print fizz
		 * 2.If the number is multiple of 5 , print buzz
		 * 3.If the number is multiple of 3 and 5 , print fizzbuzz
		 */
		List<String> fizzBuzzElementList = new ArrayList<>();
		for(int i = 0;i < fizzBuzzArray.length;i++) {
			if(fizzBuzzArray[i]%3 == 0 && fizzBuzzArray[i]%5 == 0)
//				System.out.println("fizz");
				fizzBuzzElementList.add("fizzbuzz");
				else if(fizzBuzzArray[i]%5 == 0)
//				System.out.println("buzz");
					fizzBuzzElementList.add("buzz");
			else if(fizzBuzzArray[i]%3 == 0 )
//				System.out.println("fizzbuzz");
				fizzBuzzElementList.add("fizz");
			else
//				System.out.println(fizzBuzzArray[i]);
				fizzBuzzElementList.add(String.valueOf(fizzBuzzArray[i]));
		}
		System.out.println(fizzBuzzElementList);
	}
}
