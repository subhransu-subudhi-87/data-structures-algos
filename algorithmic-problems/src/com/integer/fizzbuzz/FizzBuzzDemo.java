package com.integer.fizzbuzz;

public class FizzBuzzDemo {

	public static void main(String[] args) {

		FizzBuzzImpl fbImpl = new FizzBuzzImpl();
		int[] numArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		fbImpl.fizzBuzzFunction(numArray);
	}

}
