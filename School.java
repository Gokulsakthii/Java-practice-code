import java.util.Scanner;
public class School {

String passorfail(int totalmark)
{
    if(totalmark < 35)
    {
        return "fail";
    }
    else
    {
        return "pass";
    }
   
    //return "pass";
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalmark = sc.nextInt();
        School obj = new School();

          String result = obj.passorfail(totalmark);
          System.out.println("The student has " + result + "ed the exam.");

        
    }
}
   