/*import java.lang.System;
import java.util.Scanner;
public class practiceqestion{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        String name= scn.nextLine();
        int age = scn.nextInt();
        System.out.println(name +  age);


    }

import java.lang.System;
import java.util.Scanner;
public class practiceqestion{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();

        int age = scn.nextInt();
        scn.nextLine(); // Consume the newline character left by nextInt()
        String Addresss = scn.nextLine();
        
        System.out.println(name + " " + age + " " + Addresss);
    }
}}
import java.lang.System;
import java.util.Scanner;
public class practiceqestion{
   public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a =scn.nextInt();
    int b =scn.nextInt();
    int c =scn.nextInt();
   System.out.println("Total: " + a * b * c);
    int d =a * b * c; //125
     int e =a + b + c; //15

      System.out.println("devide: " + d/e);

   }
    }}*/
   import java.lang.System;
   import java.util.Scanner;
   public class practiceqestion{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        float score = scn.nextInt();
        scn.nextLine(); // Consume the newline character
        String department = scn.nextLine();
       
        System.out.println("my name: " + name);
        System.out.println("my score: " + score/10 + "/10"); // Assuming score is out of 100
        System.out.println("my department: " + department);

    }
    }
