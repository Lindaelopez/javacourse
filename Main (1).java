import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceDemo {
	public static void main(String[] args) {
		String[] fruitArray = new String [3];
		fruitArray[0] = "Apple";
		fruitArray[1] = "Banana";
		fruitArray[2] = "Cherry";

		System.out.println("Array: " + Arrays.toString(fruitArray));

		ArrayList<String> fruitList = new ArrayList<>();
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Cherry");
		fruitList.add("Orange");

		System.out.println("ArrayList: " + fruitList);
	}
}