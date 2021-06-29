package arrays.dynamic;

public class DynamicArray<T> {

	private int count;
	private int[] dynamicArray;

	public DynamicArray(int size) {
		this.dynamicArray = new int[size];
	}
	
	public void printDynamicArray() {
		for(int i = 0; i < count ; i++) {
			System.out.println(dynamicArray[i]);
		}
	}

	public int dynamicArraySize() {
//		 return dynamicArray.length; // Returns actual length
		return count; // Returns number of elements present
	}
	
	public void insert(int item) {
		// 1. Check if array is full , then resize the array
		if (count == dynamicArray.length) {
			// a: Create a new Array(Twice the size of the old array)
			int[] newDynamicArray = new int[count * 2];
			// b: Copy the old array elements to the new array
			for (int i = 0; i < count; i++)
				newDynamicArray[i] = dynamicArray[i];
			// c: Set the newArray ref to the old one
			dynamicArray = newDynamicArray;
		}
		// 2. insert the new item at the end of the new array
		dynamicArray[count++] = item;
	}
	
	public void removeAt(int index) {
		//1.Validate the index
		if(index < 0 || index >= count)	
			throw new IllegalArgumentException();
		//2. Shift the items to their left side after removal of the item in the particular index
		for(int i = index ; i < count ; i++)
			dynamicArray[i] = dynamicArray[i+1];
		//3.Decreament the size of the array
		count--;
	}
	
	public int searchItem(int item) {
		//1. If item is found return the index
		for(int i = 0 ; i < count ; i++)
			if(dynamicArray[i] == item)
				return i;
		//2.Else return -1
		return -1;
	}
	
	//find-max Element in the array
	public int maxElement() {
		//1. Assign first element of the array as max element
		int max = dynamicArray[0];
		for(int i = 0 ; i < count ; i++) {
		//2. Compare each element of the array to the max and update as required
			  if(max < dynamicArray[i+1]) 
				    max = dynamicArray[i+1]; 
		}
		return max;
	}
	
}//End of the Class
