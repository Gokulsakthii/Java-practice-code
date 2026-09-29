// To compare the text inside two String objects, use .equals().
// Do not use == because it compares object references, not text.

/*public class howToCompareToStrings{
	public static void main(String[] args) {
		String first = "hello";
		String second = "hai";

		if (first.equals(second)) {
			System.out.println("The strings are the same.");
		} else {
			System.out.println("The strings are different.");
		}

		// Ignore uppercase/lowercase differences with equalsIgnoreCase().
		//System.out.println("HELLO".equalsIgnoreCase("hello")); // true
	}
}

public class howToCompareToStrings{
	public static void main(String [ ] args){
		String a = "gokul";
		String b = new String("gokul");
		System.out.println(a.equals(b));
				System.out.println(a==b);

	}
}
import java.lang.System;
import java.util.Scanner;
public class howToCompareToStrings{
	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String Rcb = sc.nextLine();
	//	String b= sc.nextLine();
	//String Rcb = "win";

		if(Rcb.equals("win")){
		
		
			System.out.println("es sala cup namdhe");
		}
		else{
			System.out.println("no cup");
		}
	}
}
import java.util.Scanner;
import java.lang.System;
public class howToCompareToStrings{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String megana = sc.nextLine();
	//	String b= sc.nextLine();
	//String Rcb = "win";

		if(megana.equals("dead")){
		
		
			System.out.println("surya meets priuya");
		}
		else if(megana.equals("alive")){
			System.out.println("surya meets megana");
		}
		else{
			System.out.println("input invalid");
		}
	}
}
import java.util.Scanner;
import java.lang.System;
public class howToCompareToStrings{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Mark = sc.nextInt();
	//	String b= sc.nextLine();
	//String Rcb = "win";

		if(Mark>=35){
		
		
			System.out.println("student is pass");
		}
		else if(Mark<35){
			System.out.println("student is fail");
		}
		else{
			System.out.println(" invalid mark");
		}
	}
}*/
import java.util.Scanner;
import java.lang.System;
public class howToCompareToStrings{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int income = sc.nextInt();

		if(income>7000){
		
			System.out.println("scholarship is available");
		}
		else if(income<7000){
			System.out.println("scholarship is not available");
		}
		else{
			System.out.println(" invalid ");
		}
	}
}