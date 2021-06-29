package arrays.dynamic;

import java.util.Arrays;

public class DynamicArrayDemo {

	
	public static void main(String[] args) {

//		int[] intArray = {10,45,87,65,20,93};
//		System.out.println(Arrays.toString(intArray));
		
		DynamicArray< Integer> dynamicArray = new DynamicArray<>(3);
		dynamicArray.insert(33);
		dynamicArray.insert(63);
		dynamicArray.insert(23);
		dynamicArray.insert(99);
//		dynamicArray.removeAt(2);
		dynamicArray.printDynamicArray();
		System.out.println("Size of the Dynamic Array : "+dynamicArray.dynamicArraySize());
		System.out.println("The item is found at inex : "+dynamicArray.searchItem(99));
		System.out.println("Max element in the array : "+dynamicArray.maxElement());
	}

}
