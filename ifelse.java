
/*public class ifelse {
	public static void main(String[] args) {
		int num1 = 20;
        int num2 = 40 ;
        if(num1==num2){
            System.out.println("num1 and num2 is eqaual ");
        
        }
        else
        {
            System.out.println("num1 and num2 is not eqaual ");
        }
	}
}
import java.util.Scanner;
import java.lang.System;
public class ifelse {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        if(num1==num2){
            
            System.out.println("num1 and num2 is eqaual ");
        
        }
        else
        {
            System.out.println("num1 and num2 is not eqaual ");
        }

    }
}
public class ifelse{
    public static void main(String[]args){
        
      int score = 90;
        if(score>25 && score<89){
            System.out.println("you get video game"); 
        
        }
        else if(score > 88 && score < 91){
            System.out.println("you get laotus");
        }
        else if(score>93){
            System.out.println("you get a iphone");
        }
        else
        {
            System.out.println("you");
        }
    }
}

import java.util.Scanner;
import java.lang.System;
public class ifelse{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int score = scn.nextInt();
        if(score<50){
            System.out.println("you neesto imporave"); 
        
        }
        else if(score >= 50 && score <= 70){
            System.out.println("good job");
        }
        else if(score > 70){
            System.out.println("you get a iphone");
        }
        else
        {
            System.out.println("you");
        }
    }
}

import java.util.Scanner;
import java.lang.System;
public class ifelse{
    public static void main(String[]args){
        int tamil =30;
        int english = 80;
        int maths = 60;
        int science = 40;
        int social = 70;
        int total;
        total = tamil + english + maths + science + social;
        int avg = total / 5;
       if(avg < 35 ){
            System.out.println("Additinoal class required"); 
    
        }
        else if(total >= 300 && total <= 400){
            System.out.println("you are good ");
        }
        
    }
}

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int tamil = scn.nextInt();
        int english = scn.nextInt();
        int maths = scn.nextInt();
        int science = scn.nextInt();
        int social = scn.nextInt();

        int total = tamil + english + maths + science + social;
        int avg = total / 5;

        if (avg < 35) {
            System.out.println("Additional class is required");
        }
        else {
            System.out.println("You are good to go");
        }
    }
}


import java.util.Scanner;
import java.lang.System;
public class ifelse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String color = scn.nextLine();
        
       
       if(color.equals("red")){
        System.out.println("stop");
       }
       else if(color.equals("yellow")){
        System.out.println("get ready");
       }
       else if(color.equals("green")){
        System.out.println("go");
       }
    }
}
*/
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
       
       int Greaternumber = (num1 > num2) ? num1 : num2;

       System.out.println("Greater number is: " + Greaternumber);

        
    }
}