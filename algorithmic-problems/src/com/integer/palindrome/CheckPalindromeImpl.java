package com.integer.palindrome;

public class CheckPalindromeImpl {

	public boolean isPalindrome(int numberToCheck) {
		/**
		 *1. if the number is negative or it's last digit is 0,return false
		 */
		if (numberToCheck < 0 || (numberToCheck % 10 == 0 && numberToCheck != 0))
			return false;
       /**
        * case-1: if the number entered is an even number
        *         then , then divide the number into equal halves and compare both the halves
        *  case-2: For odd numbers,
        *    Do the same but while comparing drop the last element from the reversed one       
        */
       int reversedNum = 0;
       while(numberToCheck > reversedNum) {
    	   int pop = numberToCheck%10;
    	   reversedNum = reversedNum*10+pop;
    	   numberToCheck = numberToCheck/10;
       }
     return numberToCheck == reversedNum || numberToCheck == reversedNum/10;

	}
}
