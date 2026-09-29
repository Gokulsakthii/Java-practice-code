/**
 * A data type defines the kind of value a variable can store.
 *
 * Primitive data types:
 * - byte, short, int, and long store whole numbers.
 * - float and double store decimal numbers.
 * - char stores one character.
 * - boolean stores true or false.
 *
 * Reference data types store references to objects, such as String,
 * arrays, and objects created from classes.
 */
public class datatype {
	public static void main(String[] args) {
		int age = 25;              // whole number
		double price = 19.99;      // decimal number
		char grade = 'A';          // one character
		boolean available = true;  // true or false
		String language = "Java";  // reference type

		System.out.println(language + ": " + age + ", " + price + ", "
				+ grade + ", available = " + available);
	}
}
