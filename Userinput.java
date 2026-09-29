import java.lang.System; 
import java.util.Scanner;
public class userinput{

    public static void main(String[] args){
        Scanner goki = new Scanner(System.in);
       
        int gokulage = goki.nextInt();
        //String  raj = goki.nextLine();

        int viniage = goki.nextInt();

        System.out.println("sum: " + (gokulage + viniage));
        
    }
}