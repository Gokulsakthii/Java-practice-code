/*public class logicalopreators {
    public static void main(String[] args) {
       boolean a = true;
       boolean b = true;
      

        // Logical AND operator
        if (a && b) {
            System.out.println("Both conditions are true");
        }

       
    }
}
public class logicalopreators {
    public static void main(String[] args) {
        boolean kabaddi = false;
        boolean vollyball = false;

        // Logical OR operator
        if (kabaddi || vollyball) {
            System.out.println("play");
        } else {
            System.out.println("do not play");
        }
    }
}
public class logicalopreators {
    public static void main(String[] args) {
       int num = 12;
        if (num % 3 ==0 && num % 9 == 0) {     //both are ture only yes will print
            System.out.println("yes ");
        } else {
            System.out.println("no ");
        }

    
    }
}*/
import java.util.Scanner;
import java.lang.System;
public class logicalopreators{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 2 ==0){                  //if (number % 2 != 0) only odd will print
             System.out.println("even");     //
        }
        else{
            System.out.println("");
        }

    }

}