/*public class Array{
    public static void main(String[] args){
        
        String[] playlist = new String[5];
        playlist[0] = "Song 1";
        playlist[1] = "Song 2";
        playlist[2] = "Song 3";
        playlist[3] = "Song 4";
        playlist[4] = "Song 5";
        System.out.println(playlist[6]);

       
        }
    }

public class Array{
    public static void main(String[] args){
       String[] playlist = {"Song 1", "Song 2", "Song 3", "Song 4", "Song 5"};
       System.out.println(playlist[2]);
        }
    }
   
   import java.util.Scanner;
   public class Array{
    public static void main(String[] args){
        int[] numbers =  new int[5]; 

        Scanner scn = new Scanner(System.in);
         System.out.println("Enter 5 numbers:");
    numbers[0] = scn.nextInt();
    numbers[1] = scn.nextInt();
    numbers[2] = scn.nextInt();
    numbers[3] = scn.nextInt();
    numbers[4] = scn.nextInt();

       
        System.out.println(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);


       }
        }
    
    //
import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        int[] marks =  new int[5];  
        Scanner scn = new Scanner(System.in);
        for(int i=0; i<=4; i++){
            marks[i] = scn.nextInt();

        }
        for(int i=0; i<=4; i++){
            System.out.println(marks[i]);
        }

    }

}

public class Array{
    public static void main(String[] args){
        int[] number ={1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<=9; i++){
            System.out.println(number[i]);
        }
       

    }

}
*/
import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int getinput = scn.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(i + "x7= " + i*7);
        }
       
    }

}