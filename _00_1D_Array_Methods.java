package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	public static int sumIntArray(int[] values) {
		int total = 0;
for(int i = 0; i < values.length; i++){
System.out.println(values[i]);	
total += values[i];
}
		return total;
	}
	
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	
	public static double averageIntArray(int[] values) {
		double average = 0;
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		average += values[i];
		
		}	
		average /= values.length;
		
		return average;
	}
	
	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
		boolean contains = false;
	for (int i = 0; i < array.length; i++) {
		if (array[i] == value) {
			return true;
		}
	
		
	}
		return false;
	}
	
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return 0;
	}
}