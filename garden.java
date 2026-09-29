public class garden{

   String getname()
   {
         return "gokul";
     }
     int getphone()
     {
         return 1234567890;
     }
    
   

    public static void main(String[] args) {
       garden obj = new garden();
        String name = obj.getname();
         int num = obj.getphone();
         System.out.println("Name: " + name);
         System.out.println("Phone Number: " + num);
         
    }
}

