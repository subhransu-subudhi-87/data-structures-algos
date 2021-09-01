package com.integer.palindrome;

public class CheckPalindromDemo {

	public static void main(String[] args) {

		CheckPalindromeImpl palindromeImpl = new CheckPalindromeImpl();
		System.out.println("The number 1221 is palindrome :" + palindromeImpl.isPalindrome(1221));
		System.out.println("The number 12321 is palindrome :" + palindromeImpl.isPalindrome(12321));
		System.out.println("The number 11 is palindrome :" + palindromeImpl.isPalindrome(11));
		System.out.println("The number 12214 is palindrome :" + palindromeImpl.isPalindrome(12214));
		System.out.println("The number 122146 is palindrome :" + palindromeImpl.isPalindrome(122146));

	}

}
